package programminglaboratory1_week3;

public class Car {

    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;

    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0.0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double km) {
        double requiredFuel = km / 10.0;
        if (requiredFuel > fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            mileage += km;
            fuelLevel -= requiredFuel;
            System.out.println("Trip completed: " + km + " km.");
        }
    }

    public void refuel(double amount) {
        if (fuelLevel + amount > tankCapacity) {
            fuelLevel = tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            fuelLevel += amount;
            System.out.println("Refueled " + amount + " liters.");
        }
    }

    public void checkStatus() {
        System.out.println("Current Mileage: " + mileage + " km");
        System.out.println("Current Fuel Level: " + fuelLevel + " liters");
        if (fuelLevel < tankCapacity * 0.10) {
            System.out.println("Low fuel warning!");
        }
    }
}
