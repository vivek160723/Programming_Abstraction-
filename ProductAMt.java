package task;

public class ProductAMt {
	
	    public static void main(String[] args) {
	        // Create an array of 5 Product objects
	        Product[] products = new Product[5];
	        
	        // Initialize the Product objects with sample data
	        products[0] = new Product(1, 10, 5.99);
	        products[1] = new Product(2, 5, 9.49);
	        products[2] = new Product(3, 2, 19.99);
	        products[3] = new Product(4, 8, 12.50);
	        products[4] = new Product(5, 15, 3.49);

	        // Define a discount percentage (if applicable)
	        double discountPercentage = 10.0;

	        // Variables to keep track of total net amount
	        double totalNetAmount = 0;

	        // Iterate over the array and display details
	        for (Product product : products) {
	            double grossAmount = product.calculateGrossAmount();
	            double netAmount = product.calculateNetAmount(discountPercentage);

	            System.out.println("Product ID: " + product.getId());
	            System.out.println("Quantity: " + product.getQty());
	            System.out.println("Price per unit: $" + product.getPrice());
	            System.out.println("Gross Amount: $" + grossAmount);
	            System.out.println("Net Amount (after " + discountPercentage + "% discount): $" + netAmount);
	            System.out.println();

	            // Add net amount to total
	            totalNetAmount += netAmount;
	        }

	        // Display total net amount of all products
	        System.out.println("Total Net Amount of all products: $" + totalNetAmount);
	    }
	}


