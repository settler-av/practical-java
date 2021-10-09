package PART_II_OOP.V_overloading;

/**
 * In this class there will be water tank and power supply information.
 */
public class waterTank {
    //shows Maximum limit of water that can be stored in PART_II_OOP.V_overloading.waterTank
    final double waterTankLimit = 1000.00;
    //shows input rate of water in liters per minutes.
    final double inputWaterRate = 66.67;

    double currentWaterLevel;

    public waterTank(double currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }

    public waterTank() {
        currentWaterLevel = waterTankLimit;
    }

    /**
     * getters and setters
     */
    public double getWaterTankLimit() {
        return waterTankLimit;
    }

    public double getInputWaterRate() {
        return inputWaterRate;
    }

    public double getCurrentWaterLevel() {
        return currentWaterLevel;
    }

    /**
     * Sets the water level.
     * @param currentWaterLevel shows current water lvl.
     */
    void setCurrentWaterLevel(double currentWaterLevel) {
        this.currentWaterLevel = currentWaterLevel;
    }
}
