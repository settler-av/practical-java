public class Vehicle {
    int wheels;
    int capacity;
    double weight;
    String fuel;

    public Vehicle(int wheels, int capacity, double weight, String fuel) {
        this.wheels = wheels;
        this.capacity = capacity;
        this.weight = weight;
        this.fuel = fuel;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", capacity=" + capacity +
                ", weight=" + weight +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
public class lightVehicle extends Vehicle{
    final int twoWheels = 2;
    int average;

    public lightVehicle(int capacity, double weight, String fuel, int average) {
        super(2, capacity, weight, fuel);
        this.average = average;
    }

    @Override
    public String toString() {
        super.toString();
        return "lightVehicle{" +
                "twoWheels=" + twoWheels +
                ", average=" + average +
                '}';
    }
}
public class MotorCycle extends lightVehicle{
    String engineType;

    public MotorCycle(int capacity, double weight, String fuel, int average, String engineType) {
        super(capacity, weight, fuel, average);
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        super.toString();
        return "MotorCycle{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
public class vehicleDemo {
    public static void main(String[] args) {
        MotorCycle heroSplendoePuls = new MotorCycle(2,100,"petrol",120,"Two Stroke");

        System.out.println(heroSplendoePuls.toString());
    }
}
