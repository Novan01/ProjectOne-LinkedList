
//E-commerce company wants to keep track of all products using a linked list
//implements IDedObject interface
import java.util.*;

public class Product implements Compareable<Product>, IDedObject {

	// required variables
	private int productID; // ID of the product object
	private String productName; // name of the product object
	private String supplierName; // name of the supplier of the product object

	public Product() {
		productID = 0;
		productName = null;
		supplierName = null;
	}

	public Product(int prodID, String prodName, String supName) {
		productID = prodID;
		productName = prodName;
		supplierName = supName;
	}

	public static void main(String[] args) {
		menuSelect();
	}

	public static void printMenu() {
		System.out.println("Operations on List");
		System.out.println("1 - Empty List");
		System.out.println("2 - Find ID");
		System.out.println("3 - Insert At Front");
		System.out.println("4 - Delete From Front");
		System.out.println("5 - Delete ID");
		System.out.println("6 - Print All Records");
		System.out.println("7 - Done");
	}

	public static void menuSelect() {
		Scanner userInput = new Scanner(System.in);
		int option;

		LinkedList<Product> list = new LinkedList<Product>(); // list to hold product ID's
		// int option = userInput.nextInt();

		do {
			printMenu();
			option = userInput.nextInt();
			System.out.println("Your Choice: " + option);
			switch (option) {
				// case 1 - make empty
				case 1:
					list.makeEmpty();
					break;
				// case 2 - find ID
				case 2:

					break;
				// case 3 - insert at front
				case 3:

					System.out.print("Enter Product ID: ");
					int ID = userInput.nextInt();

					System.out.print("Enter Product Name: ");
					String name = userInput.next();

					System.out.print("Enter Supplier Name: ");
					String supplier = userInput.next();

					Product newProduct = new Product(ID, name, supplier);

					list.insertAtFront(newProduct);
					System.out.println(newProduct.getID());

					break;
				// case 4 - delete from front
				case 4:
					Product data = list.deleteFromFront();
					System.out.println("First Item Deleted: ");
					data.printID();

					break;
				// case 5 - delete id
				case 5:
					break;
				// case 6 - print all records
				case 6:
					System.out.println("Printing all Records\n");
					list.printAllRecords();
					break;
				// case 7 - done
				case 7:
					break;

				default:
					System.out.println("Invalid Option - Please enter 1-7\n");
					break;
			}

		} while (option != 7);

		userInput.close();
	}

	// implementation of interface method getID - returns the Id of the object
	public int getID() {
		return this.productID;
	}

	// implementation of interface method printID - print details of ID seperate
	// lines
	public void printID() {
		System.out.println("ID: " + this.productID + "\n" + "Product Name: " + this.productName + "\n" + "Supplier Name: " + this.supplierName + "\n");
	}

}
