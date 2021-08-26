import java.util.Scanner;

/**
 * @author 20CE155_ADNAN_VAHORA
 * @Question Develop a Program that illustrate method overloading concept.
 * <p>
 * Here I have made washing machine program in which I can virtualy wash clothes.
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

    double countTime;

    //water in and out Rate use liter/min for all rate.
    final double waterInletRate = 7;
    final double waterDrainRate = 15;
    //machine
    boolean machinePower = false;

    void power() {
        machinePower = !(machinePower);
    }

    /**
     * @// TODO: 8/26/2021 make programming in machine
     */
    void program() {
        Scanner userChoice = new Scanner(System.in);
        System.out.println("select wash Mode : \n1.\tNormal\n" +
                "2.\tSpeedy\n" +
                "3.\tDelicate\n" +
                "4.\theavy\n");
        System.out.println("Your choice : ");
        int washMode = userChoice.nextInt();

        System.out.println("select Sub-wash Mode : \n1.\tWash-Rinse-Spin\n" +
                "2.\tCustom\n");
        System.out.println("Your choice : ");
        int subWashMode = userChoice.nextInt();


        System.out.println("Current water level is " + waterLevel);
        System.out.println("Do you want to change it? (Y/N) : ");
        String waterLevelChange = userChoice.nextLine();

        if (waterLevelChange.equalsIgnoreCase("y")) {
            System.out.println("1.\tLow \n" +
                    "2.\tNormal\n" +
                    "3.\tHigh\n" +
                    "4.\tVery High\n" +
                    "Your choice : \n");
        }
        waterLevelIndicator = userChoice.nextInt();

        /**
         * @// TODO: 8/26/2021 for choice 1 - start normal wash, choice 2 - again make menu.
         */
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

    void machineRun(int mode, int waterLevel) {


    }


    void machineRun(int mode, int waterLevel, boolean wash, boolean rinse, boolean spin) {

    }

}
