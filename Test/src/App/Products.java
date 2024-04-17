package App;

import java.util.Scanner;

public class Products {
	
	public int productId;
	private String productName;
	private String dateReceive;
	private double productPrice;
	
	public Products(int productId, String productName, String dateReceive, double productPrice){
		this.productId = productId;
		this.productName = productName;
		this.dateReceive = dateReceive;
		this.productPrice = productPrice;
		
	}
	
	public Products() {
		
	}
	
	public void InputProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Product ID: ");
		this.productId = scanner.nextInt();
		System.out.print("Input Product Name: ");
		this.productName = scanner.next();
		System.out.print("Input Product date Received: ");
		this.dateReceive = scanner.next();
		System.out.print("Input Product Price: ");
		this.productPrice = scanner.nextDouble();
	}
	
	public void OutputProduct() {
		System.out.println("Product's ID: " + this.productId);
		System.out.println("Product's Name: " + this.productName);
		System.out.println("Date Received: " + this.dateReceive);
		System.out.println("Price: " + this.productPrice);
	}
	
	
	
	
		
}
