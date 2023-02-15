

//Linked List class
//import java.io.*;


//custom singly linked list class that impplements IDedObject interface
public class LinkedList<T extends IDedObject> {
	private Node<T> head;
	// private Node<T> tail;

	public LinkedList() {

	}

	// clear out the whole linked list
	public void makeEmpty() {
		if (isEmpty()) {
			System.out.println("List is already empty");
		}
		Node<T> currNode = head;
		while(!isEmpty()) {
			head = head.getNext();
			currNode.setNext(null);
		}
		
		System.out.println("List emptied");

	}

	// traverse the linked list to find node with ID ID - DOESNT WORK
	public T findID(int ID) {

		if (isEmpty()) {
			System.out.println("List is empty - nothing to find");
		}
		//if our desired node if the first node then retrieve the data and return the data
		if(head.getData().getID() == ID) {
			T nodeData = head.getData();
			return nodeData;
		}
		//otherwise set our head node, next ptr and data
		
		Node<T> nextPtr = head.getNext();
		T nodeData = null;

		//while there is still another node to check
		while (nextPtr != null) {
			if(nextPtr.getData().getID() == ID)
			{
				//our nodedata = our next ptr data 
				nodeData = nextPtr.getData();
				break;
			}
			else {
				//else our current node pointer goes to the next node and our next ptr points to its next node
				
				nextPtr = nextPtr.getNext();
			}
			
		}
		return nodeData;

	}

	// insert Node<E> at the fron
	public boolean insertAtFront(T x) {
		Node<T> currNode = head;
		// if the list is empty the new node is the head node and also tail
		if (isEmpty()) {
			head = new Node<T>(x);
			// tail = head;
			return true;
		}
		// otherwise create a new node and set its next pointer to the head and set head
		// to newnode
		while(currNode != null) {
			//if the current node has the same id as the node we want to create
			if(currNode.getData().getID() == x.getID()) {
				return false;
			}
			else {
				currNode = currNode.getNext();
			}
			
		}
		Node<T> newNode = new Node<T>(x);
		newNode.setNext(head);
		head = newNode;
		return true;
	}

	// delete front node
	public T deleteFromFront() {
		if (isEmpty()) {
			System.out.println("List is empty - nothing to delete");
		}
		Node<T> currNode = head;
		head = head.getNext();
		currNode.setNext(null);
		return currNode.getData();
	}

	// delete node with ID - int ID
	public T delete(int ID) {

		if (isEmpty()) {
			System.out.println("List is empty - nothing to delete");
		}

		//if our desired node if the first node then retrieve the data and return the node while setting the head to the next node
		if(head.getData().getID() == ID) {
			T nodeData = head.getData();
			head = head.getNext();
			return nodeData;
		}
		//otherwise set our head node, next ptr and data
		Node<T> currNode = head;
		Node<T> nextPtr = head.getNext();
		T nodeData = null;

		//while there is still another node to check
		while (nextPtr != null) {
			if(nextPtr.getData().getID() == ID)
			{
				//our nodedata = our next ptr data and set the current node to the next nodes next pointer to delete the next node
				nodeData = nextPtr.getData();
				currNode.setNext(nextPtr.getNext());
				break;
			}
			else {
				//else our current node pointer goes to the next node and our next ptr points to its next node
				currNode = nextPtr;
				nextPtr = nextPtr.getNext();
			}
			
		}
		return nodeData;
		
	}

	// traverse the linked list and print all nodes and data
	public void printAllRecords() {
		Node<T> currNode = head;
		if(isEmpty()) {
			System.out.println("List is empty - No records to print");
		}
		//while each node is not null print the data and set currnode to the next node
		while (currNode != null) {
			currNode.getData().printID();
			currNode = currNode.getNext();
		}
	}

	//method to check that there is a head meaning the list is not empty
	public boolean isEmpty() {
		return head == null;
	}
}
