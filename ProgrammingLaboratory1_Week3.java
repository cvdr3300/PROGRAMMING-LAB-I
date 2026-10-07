package programminglaboratory1_week3;

public class ProgrammingLaboratory1_Week3 {

    public static void main(String[] args) {
        
        Car car = new Car("38 AEC 3838", "TOGG T10X", 20.0, 60.0);

        car.checkStatus();
        System.out.println("----------------------------------------");

        // Normal sürüş
        System.out.println("\nDriving 100 km...");
        car.drive(100);
        car.checkStatus();
        System.out.println("----------------------------------------");
        
        // Edge case: Yetmeyen yakıtla sürüş denemesi
        System.out.println("\nDriving 300 km...");
        car.drive(300);
        System.out.println("----------------------------------------");
        
        // Normal yakıt dolumu
        System.out.println("\nRefueling 20 liters...");
        car.refuel(20);
        System.out.println("----------------------------------------");
        
        // Edge case: Depoyu taşıran yakıt dolumu denemesi
        System.out.println("\nRefueling 100 liters...");
        car.refuel(100);
        System.out.println("----------------------------------------");

        car.checkStatus();
        
    }
    
}
