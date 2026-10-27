package programminglaboratory1_week6;

public class Ride {
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;

        if (distanceKm <= 0) {
            System.out.println("Warning: distanceKm must be positive!");
            this.distanceKm = 1.0;
        } else {
            this.distanceKm = distanceKm;
        }

        if (durationMin <= 0) {
            System.out.println("Warning: durationMin must be positive!");
            this.durationMin = 1;
        } else {
            this.durationMin = durationMin;
        }

        if (pricePerKm <= 0) {
            System.out.println("Warning: pricePerKm must be positive!");
            this.pricePerKm = 1.0;
        } else {
            this.pricePerKm = pricePerKm;
        }
    }

    public double calculateFare() {
        return this.distanceKm * this.pricePerKm;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "passengerName='" + passengerName + '\'' +
                ", pickup='" + pickup + '\'' +
                ", destination='" + destination + '\'' +
                ", distanceKm=" + distanceKm +
                ", durationMin=" + durationMin +
                ", pricePerKm=" + pricePerKm +
                '}';
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }
}