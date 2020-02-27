package murach.business;

import java.text.NumberFormat;

public class LineItem {

    private Product product;
    private int quantity;

    public LineItem() {
        this.product = null;
        this.quantity = 0;
    }
    // Display the product and the quantity
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    // Display the Product
    public void setProduct(Product product) {
        this.product = product;
    }
    // Get the Product from ProductDB
    public Product getProduct() {
        return product;
    }
    // Set the Quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // Get the quantity from ProductDB
    public int getQuantity() {
        return quantity;
    }
    // Get the Total
    public double getTotal() {
        double total = quantity * product.getPrice();
        return total;
    }
    
    public String getTotalFormatted() {
        double total = this.getTotal();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String totalFormatted = currency.format(total);        
        return totalFormatted;
    }
}