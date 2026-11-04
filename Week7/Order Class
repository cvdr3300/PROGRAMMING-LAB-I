package programminglaboratory1_week7;

import java.util.ArrayList;

public class Order {

    private static int nextOrderNumber = 1001;
    public static final double MIN_ORDER = 100.0;
    public static final double DELIVERY_FEE = 20.0;
    private static int completedOrders = 0;
    private static double totalRevenue = 0.0;

    private int orderNumber;
    private Customer customer;
    private ArrayList<MenuItem> items;
    private Coupon appliedCoupon;
    private boolean isCompleted;

    public Order(Customer customer) {
        this.orderNumber = nextOrderNumber++;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.appliedCoupon = null;
        this.isCompleted = false;
    }

    public void addItem(MenuItem item) throws InvalidQuantityException {
        for (MenuItem existingItem : items) {
            if (existingItem.getName().equalsIgnoreCase(item.getName())) {
                existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
                return;
            }
        }
        items.add(item);
    }

    public void removeItem(String name) throws ItemNotFoundException {
        MenuItem target = null;
        for (MenuItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                target = item;
                break;
            }
        }
        if (target == null) {
            throw new ItemNotFoundException("Siparişten silinemedi: '" + name + "' bulunamadı.");
        }
        items.remove(target);
    }

    public void updateQuantity(String name, int quantity) throws ItemNotFoundException, InvalidQuantityException {
        for (MenuItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setQuantity(quantity);
                return;
            }
        }
        throw new ItemNotFoundException("Adet güncellenemedi: '" + name + "' bulunamadı.");
    }

    public double getSubtotal() {
        double subtotal = 0;
        for (MenuItem item : items) {
            subtotal += item.getTotalPrice();
        }
        return subtotal;
    }

    public ArrayList<MenuItem> getItems() {
        return new ArrayList<>(this.items);
    }

    public boolean applyCoupon(Coupon coupon) {
        if (coupon != null && getSubtotal() >= coupon.getMinSubtotal()) {
            this.appliedCoupon = coupon;
            return true;
        }
        return false;
    }

    public double checkout() throws MinimumOrderException {
        if (isCompleted) {
            throw new IllegalStateException("Sipariş #" + orderNumber + " zaten tamamlanmış.");
        }

        double subtotal = getSubtotal();
        if (subtotal < MIN_ORDER) {
            throw new MinimumOrderException(String.format(
                    "Minimum sepet tutarı karşılanmadı! Sepet: %.2f TL, Gerekli: %.2f TL", subtotal, MIN_ORDER));
        }

        double discount = 0.0;
        if (appliedCoupon != null) {
            discount = subtotal * appliedCoupon.getDiscountRate();
        }

        double total = (subtotal - discount) + DELIVERY_FEE;

        System.out.println("================ SIPARIS FISI ================");
        System.out.println("Siparis No       : #" + orderNumber);
        System.out.println("Musteri          : " + customer.getName());
        System.out.println("Adres            : " + customer.getAddress());
        System.out.println("----------------------------------------------");
        System.out.println("Urunler:");
        for (MenuItem item : items) {
            System.out.println(" - " + item);
        }
        System.out.println("----------------------------------------------");
        System.out.printf("Ara Toplam (Subtotal) : %.2f TL%n", subtotal);
        if (appliedCoupon != null) {
            System.out.printf("Kupon Indirimi (%s) : -%.2f TL%n", appliedCoupon.getCode(), discount);
        } else {
            System.out.println("Kupon Indirimi        : 0.00 TL");
        }
        System.out.printf("Teslimat Ucreti       : %.2f TL%n", DELIVERY_FEE);
        System.out.printf("GENEL TOPLAM          : %.2f TL%n", total);
        System.out.println("==============================================\n");

        completedOrders++;
        totalRevenue += total;
        isCompleted = true;

        return total;
    }

    public static int getCompletedOrders() {
        return completedOrders;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
