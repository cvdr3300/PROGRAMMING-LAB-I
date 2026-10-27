package programminglaboratory1_week6;

import java.util.ArrayList;

public class ProgrammingLaboratory1_Week6 {

    public static void main(String[] args) {

        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new Ride("Ahmet", "Melikgazi", "Talas", 15.0, 20, 10.0));
        rides.add(new EconomyRide(2.5, "Mehmet", "Kocasinan", "Erciyes", 12.0, 15, 8.0));
        rides.add(new PremiumRide(100.0, 1.5, "Ayşe", "Havalimanı", "Talas", 25.0, 35, 12.0));
        rides.add(new SharedRide(3, 2.0, "Ali", "Meydan", "Kampüs", 8.0, 10, 5.0));

        for (Ride ride : rides) {
            System.out.println(ride.toString());
            System.out.println("Calculated Fare: " + ride.calculateFare() + " TL");
            System.out.println("--------------------------------------------------------------------------------");
        }

    
    }
    
}
