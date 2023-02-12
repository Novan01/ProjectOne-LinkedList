
//Linked List class
//import java.io.*;

//custom singly linked list class that impplements IDedObject interface
public class LinkedList<T> implements IDedObject {
	public Node<T> head;

	public LinkedList() {
		head.setData(null);
		head.setNext(null);
	}

	// clear out the whole linked list
	public void makeEmpty() {
		Node<T> currNode = head;
		if (currNode != null) {
			while (currNode.getNext() != null) {
				// currNode.setData(null);
				currNode = null;
			}
		}

	}

	// traverse the linked list to find node with ID ID
	public T findID(int ID) {
		return null;

	}

	// insert Node<E> at the fron
	public boolean insertAtFront(T x) {
		Node<T> new_head = new Node<T>(x); // new head node is the node we want to inset
		// new_head.setNext(null); // the pointer to the next is now pointing at old
		// head

		// if there is no head node
		if (head == null) {
			head = new_head;
		}
		// else, traverse the list to find the next place to put the old head node
		else {
			new_head.setNext(head); // set the next pointer to the current head
		}
		return true;
	}

	// delete front node
	public T deleteFromFront() {
		T headData = head.getData();
		if (head != null) {
			head = null;
		}
		return headData;
	}

	// delete node with ID - int ID
	public T delete(int ID) {

		Node<T> currNode = head;

		return null;
	}

	// traverse the linked list and print all nodes and data
	public void printAllRecords() {
		Node<T> currNode = head;
		Node<T> nextNode = head.getNext();
		while (currNode != null) {
			System.out.println(currNode);
			currNode = nextNode;
			nextNode = nextNode.getNext();
		}
	}

	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void printID() {
		// TODO Auto-generated method stub
	}

}
