
//E-commerce company wants to keep track of all products using a linked list
//implements IDedObject interface
import java.util.*;

public class Product<T> implements IDedObject<T> {

	// required variables
	private int productID; // ID of the product object
	private String productName; // name of the product object
	private String supplierName; // name of the supplier of the product object

	public static void main(String[] args) {

	}

	// implementation of interface method getID - returns the Id of the object
	public int getID() {
		return productID;
	}

	// implementation of interface method printID - print details of ID seperate
	// lines
	public void printID() {
		System.out.println(productID + "\n" + productName + "\n" + supplierName);
	}

}
