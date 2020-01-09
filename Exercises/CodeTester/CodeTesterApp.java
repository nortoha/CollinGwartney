public class CodeTesterApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Code Tester");
        System.out.println();

        String description = "Lemon";
        // calculate and display a total
        String productCode = "java";
        double price = 49.50;
        int quantity = 2;
        double tax = .075;
        double total = price * quantity;
        double TaxAmount = total * tax;
        double grand = total + TaxAmount;
        String message = 
            "Code:        " + productCode + "\n" +
            "Description: " + description + "\n" +
            "Price:       " + price + "\n" +
            "Quantity:    " + quantity + "\n" +
            "Total:       " + total + "\n" +
            "Tax Percent: " + tax * 100 + "\n" +
            "Tax Amount:  " + TaxAmount + "\n" +
            "Grand Total: " + grand + "\n";
        System.out.println(message);

        // display your name        
        System.out.println("This Code is By Hamburger");
        
     
        // display a goodbye message
        System.out.println("Bye!");
    }
}
