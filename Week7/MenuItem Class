package programminglaboratory1_week7;

public class MenuItem {

    private String name;
    private double price;
    private int quantity;

    public MenuItem(String name, double price, int quantity) throws InvalidQuantityException {
        if (price <= 0) {
            throw new IllegalArgumentException("Fiyat pozitif bir değer olmalıdır.");
        }
        this.name = name;
        this.price = price;
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Fiyat pozitif bir değer olmalıdır.");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws InvalidQuantityException {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Ürün adedi 0 veya negatif olamaz: " + quantity);
        }
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%s x%d - Adet: %.2f TL | Toplam: %.2f TL", name, quantity, price, getTotalPrice());
    }
}
