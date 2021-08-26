/**
 * @author 20CE155_ADNAN_VAHORA
 * @Question Develop a Program that illustrate method overloading concept.
 *
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


}
