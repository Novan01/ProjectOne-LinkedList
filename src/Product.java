
//E-commerce company wants to keep track of all products using a linked list
//implements IDedObject interface
import java.util.*;
import java.lang.Comparable;

public class Product implements Comparable<Product>, IDedObject {

	// required variables
	private int productID; // ID of the product object
	private String productName; // name of the product object
	private String supplierName; // name of the supplier of the product object


	public Product(int prodID, String prodName, String supName) {
		productID = prodID;
		productName = prodName;
		supplierName = supName;
	}

	public static void main(String[] args) {
		menuSelect();
	}

	public static void printMenu() {
		System.out.println();
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
					System.out.print("ID No: ");
					list.findID(userInput.nextInt());
					break;
				// case 3 - insert at front
				case 3:

					System.out.print("Enter Product ID: ");
					int ID = userInput.nextInt();

					userInput.nextLine();
					System.out.print("Enter Product Name: ");
					String name = userInput.nextLine();

					//userInput.nextLine();
					System.out.print("Enter Supplier Name: ");
					String supplier = userInput.nextLine();

					Product newProduct = new Product(ID, name, supplier);

					list.insertAtFront(newProduct);

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
	@Override
	public int getID() {
		return this.productID;
	}

	// implementation of interface method printID - print details of ID seperate
	// lines
	@Override
	public void printID() {
		System.out.println("ID: " + this.productID + "\n" + "Product Name: " + this.productName + "\n" + "Supplier Name: " + this.supplierName + "\n");
	}

	@Override
	public int compareTo(Product o) {
		// if the string are not equal
        if (this.productName.compareTo(o.productName) != 0) {
            return this.productName.compareTo(o.productName);
        }
        else {
            // we compare int values
            // if the strings are equal
            return this.productID - o.productID;
        }
	}

}
