package programminglaboratory1_week2;

import java.util.Scanner;

public class ProgrammingLaboratory1_Week2 {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of stops: ");
        int numStops = scanner.nextInt();

        System.out.print("Enter bus seating capacity: ");
        int seatingCapacity = scanner.nextInt();
        scanner.nextLine();

        String[] stopNames = new String[numStops];
        int[] boarding = new int[numStops];
        int[] alighting = new int[numStops];
        int[] occupancies = new int[numStops];

        System.out.println("\n--- Enter Stop Details ---");
        for (int i = 0; i < numStops; i++) {
            System.out.print("Enter name for stop " + (i + 1) + ": ");
            stopNames[i] = scanner.nextLine();

            System.out.print("Passengers boarding at " + stopNames[i] + ": ");
            boarding[i] = scanner.nextInt();

            System.out.print("Passengers alighting at " + stopNames[i] + ": ");
            alighting[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int currentPassengers = 0;
        int overCapacityStops = 0;

        System.out.println("\n--- Processing Route ---");
        for (int i = 0; i < numStops; i++) {
            if (currentPassengers + boarding[i] - alighting[i] < 0) {
                System.out.println("Data error at [" + stopNames[i] + "]: cannot have more passengers alighting than are currently on the bus. Occupancy set to 0.");
                currentPassengers = 0;
            } else {
                currentPassengers += boarding[i] - alighting[i];
            }

            occupancies[i] = currentPassengers;
            System.out.println("Stop: " + stopNames[i] + " | Current Passengers: " + currentPassengers);

            if (currentPassengers > seatingCapacity) {
                System.out.println("Warning: Bus is over capacity at [" + stopNames[i] + "]!");
                overCapacityStops++;
            }
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.printf("%-15s | %-10s | %-10s | %-10s\n", "Stop Name", "Boarding", "Alighting", "Occupancy");
        System.out.println("-".repeat(50));
        for (int i = 0; i < numStops; i++) {
            System.out.printf("%-15s | %-10d | %-10d | %-10d\n", stopNames[i], boarding[i], alighting[i], occupancies[i]);
        }
        System.out.println("=".repeat(50));

        int maxBoarding = boarding[0];
        int busiestStopIndex = 0;
        int totalOccupancy = 0;

        for (int i = 0; i < numStops; i++) {
            if (boarding[i] > maxBoarding) {
                maxBoarding = boarding[i];
                busiestStopIndex = i;
            }
            totalOccupancy += occupancies[i];
        }

        double avgOccupancy = (double) totalOccupancy / numStops;

        System.out.println("\n--- Route Statistics ---");
        System.out.println("Busiest stop (highest boarding): " + stopNames[busiestStopIndex] + " (" + maxBoarding + " passengers)");
        System.out.printf("Average bus occupancy: %.2f\n", avgOccupancy);
        System.out.println("Number of stops exceeding capacity: " + overCapacityStops);

        if (currentPassengers == 0) {
            System.out.println("Final occupancy check: Passed (0 passengers remaining).");
        } else {
            System.out.println("Final occupancy check: Warning! Bus ended route with " + currentPassengers + " passenger(s).");
        }

        scanner.close();
    }
    
}
