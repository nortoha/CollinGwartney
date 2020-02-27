package murach.business;

import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;

    public Product() {
        code = "";
        description = "";
        price = 0;
    }
    // Display the code
    public void setCode(String code) {
        this.code = code;
    }
    // Get the code from the ProductDB java class
    public String getCode() {
        return code;
    }
    // Display the description
    public void setDescription(String description) {
        this.description = description;
    }
    // Get the description from ProductDB
    public String getDescription() {
        return description;
    }
    // Display the price
    public void setPrice(double price) {
        this.price = price;
    }
    // Get the price from ProductDB
    public double getPrice() {
        return price;
    }
    // Get the currency instance, the format, and the price
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(price);
        return priceFormatted;
    }    
}