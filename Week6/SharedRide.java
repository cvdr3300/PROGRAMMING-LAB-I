package programminglaboratory1_week6;

public class SharedRide extends EconomyRide {
    private int passengerCount;

    public SharedRide(int passengerCount, double pricePerMinute, String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        super(pricePerMinute, passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);

        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("Warning: passengerCount must be between 1 and 4!");
            this.passengerCount = 1;
        } else {
            this.passengerCount = passengerCount;
        }
    }

    @Override
    public double calculateFare() {
        double economyRideFare = super.calculateFare();
        double farePerPassenger = economyRideFare / this.passengerCount;
        return farePerPassenger * 1.10; 
    }

    @Override
    public String toString() {
        return super.toString() + " -> SharedRide{passengerCount=" + passengerCount + "}";
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}