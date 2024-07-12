package task;

public class Product {
    // Private fields
    private int id;
    private int qty;
    private double price;

    // Constructor
    public Product(int id, int qty, double price) {
        this.id = id;
        this.qty = qty;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to calculate gross amount
    public double calculateGrossAmount() {
        return qty * price;
    }

    // Method to calculate net amount
    // Assuming a discount for demonstration; adjust as needed
    public double calculateNetAmount(double discountPercentage) {
        double discount = calculateGrossAmount() * discountPercentage / 100;
        return calculateGrossAmount() - discount;
    }
}
