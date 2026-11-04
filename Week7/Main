package programminglaboratory1_week7;

public class ProgrammingLaboratory1_Week7 {

    public static void main(String[] args) {
        
        System.out.println("### 1. Müşteri ve Siparişlerin Oluşturulması ###");
        Customer customer1 = new Customer("Ali Yılmaz", "05551112233", "Talas Bulvarı No:12", "Melikgazi", "Kayseri");
        Customer customer2 = new Customer("Ayşe Demir", "05442223344", "Atatürk Cad. No:5", "Kocasinan", "Kayseri");
        Order order1 = new Order(customer1);
        Order order2 = new Order(customer2);
        System.out.println("Sipariş 1 Numarası: #" + order1.getOrderNumber());
        System.out.println("Sipariş 2 Numarası: #" + order2.getOrderNumber());

        
        
        
        
        
        System.out.println("\n### 2. Ürün Ekleme, Aynı Ürünü İki Kez Ekleme ve Düzenleme ###");

        try {
            order1.addItem(new MenuItem("Burger", 120.0, 1));
            order1.addItem(new MenuItem("Burger", 120.0, 1));
            order1.addItem(new MenuItem("Patates Kızartması", 50.0, 1));
            order1.addItem(new MenuItem("Kola", 30.0, 1));

            System.out.println("Burger 2 kez eklendi. Güncel ara toplam: " + order1.getSubtotal() + " TL");

            order1.updateQuantity("Kola", 2);
            System.out.println("Kola adedi 2 yapıldı. Güncel ara toplam: " + order1.getSubtotal() + " TL");

            order1.removeItem("Patates Kızartması");
            System.out.println("Patates Kızartması çıkarıldı. Güncel ara toplam: " + order1.getSubtotal() + " TL");
        } catch (InvalidQuantityException | ItemNotFoundException e) {
            System.err.println("Beklenmeyen hata: " + e.getMessage());
        }

        
        
        
        
        
        System.out.println("\n### 3. Kupon Uygulama ve Checkout Senaryoları ###");

        Coupon coupon20 = new Coupon("INDIRIM20", 0.20, 200.0);
        boolean applied1 = order1.applyCoupon(coupon20);
        System.out.println("Kupon 1 (INDIRIM20) uygulandı mı? " + (applied1 ? "Evet" : "Hayır"));

        try {
            order1.checkout();
        } catch (MinimumOrderException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        
        
        try {
            order2.addItem(new MenuItem("Pizza", 150.0, 1));
            Coupon couponBig = new Coupon("BUYUK50", 0.30, 500.0);
            boolean applied2 = order2.applyCoupon(couponBig);
            System.out.println("Kupon 2 (BUYUK50) uygulandı mı? " + (applied2 ? "Evet (Beklenmeyen)" : "Hayır (Şart sağlanmadı)"));
            order2.checkout();
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

        
        
        
        
        
       
        System.out.println("### 4. Özel İstisnaların (Exceptions) Tetiklenmesi ve Yakalanması ###");

        try {
            System.out.println("[Test 1] Geçersiz adetle ürün oluşturuluyor...");
            MenuItem invalidItem = new MenuItem("Tatlı", 60.0, -2);
        } catch (InvalidQuantityException e) {
            System.out.println("Yakalandı -> InvalidQuantityException: " + e.getMessage());
        }

        
        
        try {
            System.out.println("[Test 2] Olmayan ürün silinmeye çalışılıyor...");
            order1.removeItem("Lahmacun");
        } catch (ItemNotFoundException e) {
            System.out.println("Yakalandı -> ItemNotFoundException: " + e.getMessage());
        }

        
        
        try {
            System.out.println("[Test 3] Minimum tutarın altında checkout yapılıyor...");
            Order smallOrder = new Order(customer1);
            smallOrder.addItem(new MenuItem("Su", 15.0, 1)); // 15 TL < MIN_ORDER (100 TL)
            smallOrder.checkout();
        } catch (MinimumOrderException e) {
            System.out.println("Yakalandı -> MinimumOrderException: " + e.getMessage());
        } catch (InvalidQuantityException e) {
            System.out.println("Hata: " + e.getMessage());
        }

        
        
        System.out.println("\n### 5. Statik İstatistiklerin Yazdırılması ###");
        System.out.println("Tamamlanan Toplam Sipariş Sayısı: " + Order.getCompletedOrders());
        System.out.printf("Elde Edilen Toplam Gelir         : %.2f TL%n", Order.getTotalRevenue());
    }

}
