import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/**
 * @author 20CE155_ADNAN_VAHORA
 * @Question Develop a Program that illustrate method overloading concept.
 * <p>
 * Here I have made washing machine program in which I can virtually wash clothes.
 * machine has different functionality like Wash, Rinse and Spin.
 * and have different modes like speedy, delicate, heavy, normal.
 * and have warning for low water.
 */
public class WashingMachine {
    /**
     * variables for water storage, and management.
     * use liter for volume
     */
    final double waterLevelLow = 20;
    final double waterLevelMedium = 40;
    final double waterLevelHigh = 60;
    final double waterLevelVeryHigh = 70;
    double currentWaterLevel;
    String waterLevel = "Normal";
    int waterLevelIndicator = 2;
    /**
     * variables for time management.
     * use minutes for time
     */
    //Wash mode times
    final double delicateWashTime = 13;
    final double speedyWashTime = 10;
    final double normalWashTime = 15;
    final double heavyWashTime = 17;

    final double delicateRinseTime = 13;
    final double speedyRinseTime = 10;
    final double normalRinseTime = 15;
    final double heavyRinseTime = 17;

    final double delicateSpinTime = 3;
    final double speedySpinTime = 4;
    final double normalSpinTime = 5;
    final double heavySpinTime = 7;

    double countTime = 0;

    //water in and out Rate use liter/min for all rate.
    final double waterInletRate = 7;
    final double waterDrainRate = 15;

    public WashingMachine() {
        countTime = 0;
        currentWaterLevel = 0;
    }

    //machine
    boolean machinePower = false;
    void addWater(double liter){
        countTime += liter/waterInletRate;
        currentWaterLevel += liter;
    }
    void addWater(int mode){
        switch (mode) {
            case 1:
                addWater(waterLevelLow);
                break;
            case 2:
                addWater(waterLevelMedium);
                break;
            case 3:
                addWater(waterLevelHigh);
                break;
            case 4:
                addWater(waterLevelVeryHigh);
                break;
        }
    }

    void drainWater(){
        countTime -= currentWaterLevel/waterDrainRate;
        currentWaterLevel = 0;
        System.out.println("Water has drained.");
    }
    void washProcessCompleteBuzzer(){
        System.out.println("Washing process completed.");
    }
    void power() {
        machinePower = !(machinePower);
    }

    /**
     * This is original menu-driven Program.
     */
    void program() {
        Scanner userChoice = new Scanner(System.in);
        System.out.println("select wash Mode : \n1.\tNormal\n" +
                "2.\tSpeedy\n" +
                "3.\tDelicate\n" +
                "4.\theavy\n");
        System.out.println("Your choice (Write String): ");
        userChoice = new Scanner(System.in);
        String washMode = userChoice.nextLine();

        System.out.println("select Sub-wash Mode : \n1.\tWash-Rinse-Spin\n" +
                "2.\tCustom\n");
        System.out.println("Your choice : ");
        userChoice = new Scanner(System.in);
        int subWashMode = userChoice.nextInt();


        System.out.println("Current water level is " + waterLevel);
        System.out.println("Do you want to change it? (Y/N) : ");
        userChoice = new Scanner(System.in);
        String waterLevelChange = userChoice.nextLine();

        if (waterLevelChange.equalsIgnoreCase("y")) {
            System.out.println("1.\tLow \n" +
                    "2.\tNormal\n" +
                    "3.\tHigh\n" +
                    "4.\tVery High\n" +
                    "Your choice : \n");
            waterLevelIndicator = userChoice.nextInt();
        }

        if (subWashMode == 1) {
            machineRun(washMode, waterLevelIndicator);
        } else if (subWashMode == 2) {
            System.out.println("1.\tWash-Rinse\n" +
                    "2.\tRinse-Spin\n" +
                    "3.\tWash only\n" +
                    "4.\tSpin only\n" +
                    "Your choice : \n");
            int subWashModeChoice = userChoice.nextInt();
            boolean[] choiceArr = {true, true, true};
            if (subWashModeChoice == 1) {
                choiceArr = new boolean[]{true, true, false};
            } else if (subWashModeChoice == 2) {
                choiceArr = new boolean[]{false, true, true};
            } else if (subWashModeChoice == 3) {
                choiceArr = new boolean[]{true, false, false};
            } else if (subWashModeChoice == 4) {
                choiceArr = new boolean[]{false, false, true};
            }
            machineRun(washMode, waterLevelIndicator, choiceArr[0],choiceArr[1],choiceArr[2]);
        } else {
            System.out.println("Enter proper choice.");
        }
    }

    /**
     * Runs the machine in default manner. With no additional functionality.
     * @param mode describes the mode
     * @param waterLevel shows water level.
     */
    void machineRun(String mode, int waterLevel) {
        addWater(waterLevel);
        washRun(mode);
        addWater(waterLevel);
        rinseRun(mode);
        spinRun(mode);
        washProcessCompleteBuzzer();
        System.out.println(toString());
    }

    /**
     * Just console log thing will not be in production mode.
     * @return string to check all things
     */
    @Override
    public String toString() {
        return "WashingMachine{" +
                "waterLevel='" + currentWaterLevel + '\'' +
                ", countTime=" + countTime +
                ", machinePower=" + machinePower +
                '}';
    }

    /**
     * Costume was options available here. user can add his task like spin only.
     * @param mode tells mode of wash.
     * @param waterLevel tells water level of wash mode. addWater() method will use this functionality.
     * @param wash true when user wants to add wash Functionality.
     * @param rinse true when user wants to add rinse Functionality.
     * @param spin true when user wants to add spin Functionality.
     */
    void machineRun(String mode, int waterLevel, boolean wash, boolean rinse, boolean spin) {

        if(wash){
            addWater(waterLevel);
            washRun(mode);
        }
        if(rinse){
            addWater(waterLevel);
            rinseRun(mode);
        }
        if(spin){
            spinRun(mode);
        }
        washProcessCompleteBuzzer();
    }

    /**
     * Independent method to wash clothes.
     * @param mode tells how much time to wash clothes.
     */
    void washRun(@org.jetbrains.annotations.NotNull String mode){
        //noinspection DuplicatedCode
        if(mode.equalsIgnoreCase("speedy")){
            countTime += speedyWashTime;
        }else if(mode.equalsIgnoreCase("normal")){
             countTime += normalWashTime;
        }else if(mode.equalsIgnoreCase("delicate")){
            countTime += delicateWashTime;
        }else if(mode.equalsIgnoreCase("heavy")){
            countTime += heavyWashTime;
        }
        drainWater();
    }

    /**
     * Independent method to Rinse clothes.
     * @param mode tells how much time to Rinse clothes.
     */
    void rinseRun(@NotNull String mode){
        //noinspection DuplicatedCode
        if(mode.equalsIgnoreCase("speedy")){
            countTime += speedyRinseTime;
        }else if(mode.equalsIgnoreCase("normal")){
            countTime += normalRinseTime;
        }else if(mode.equalsIgnoreCase("delicate")){
            countTime += delicateRinseTime;
        }else if(mode.equalsIgnoreCase("heavy")){
            countTime += heavyRinseTime;
        }
        drainWater();
    }

    /**
     * Independent method to spin clothes.
     * @param mode tells how much time to spin clothes.
     */

    void spinRun(@NotNull String mode){
        //noinspection DuplicatedCode
        if(mode.equalsIgnoreCase("speedy")){
            countTime += speedySpinTime;
        }else if(mode.equalsIgnoreCase("normal")){
            countTime += normalSpinTime;
        }else if(mode.equalsIgnoreCase("delicate")){
            countTime += delicateSpinTime;
        }else if(mode.equalsIgnoreCase("heavy")){
            countTime += heavySpinTime;
        }
    }
/*
 * // TODO: 8/27/2021 Add water tank functionality in which they use actual water from water tank.
 *  show error when tank runs out of water.
 *  ask user to fill the water tank.
 */
}
