
//Linked List class
//import java.io.*;


//custom singly linked list class that impplements IDedObject interface
public class LinkedList<T> {
	private Node<T> head;
	// private Node<T> tail;

	public LinkedList() {

	}

	// clear out the whole linked list
	public void makeEmpty() {
		if (isEmpty()) {
			throw new RuntimeException("List is already Empty");
		}
		Node<T> currNode = head;
		while(!isEmpty()) {
			head = head.getNext();
			currNode.setNext(null);
		}
		
		System.out.println("List emptied");

	}

	// traverse the linked list to find node with ID ID
	public T findID(int ID) {

		Node<T> currNode = head;
		Node<T> searchNode = new Node(ID);
		T nodeData = currNode.getData();

		if (isEmpty()) {
			throw new RuntimeException("List is Empty");
		}
		while (!isEmpty()) {
			if (currNode.getData().equals(ID)) {
				return nodeData;
			} 
			else {
				searchNode = head.getNext();
				nodeData = searchNode.getData();
				if (searchNode.getNext() == null) {
					throw new RuntimeException("The given ID is not in the list");
				}
			}
		}
		return null;

	}

	// insert Node<E> at the fron
	public boolean insertAtFront(T x) {
		// if the list is empty the new node is the head node and also tail
		if (isEmpty()) {
			head = new Node<T>(x);
			// tail = head;
			return true;
		}
		// otherwise create a new node and set its next pointer to the head and set head
		// to newnode
		Node<T> newNode = new Node<T>(x);
		newNode.setNext(head);
		head = newNode;
		return true;
	}

	// delete front node
	public T deleteFromFront() {
		if (isEmpty()) {
			throw new RuntimeException("List is Empty");
		}
		Node<T> currNode = head;
		head = head.getNext();
		currNode.setNext(null);
		return currNode.getData();
	}

	// delete node with ID - int ID
	public T delete(int ID) {
		Node<T> currNode = head;
		T nodeData = currNode.getData();

		if (isEmpty()) {
			throw new RuntimeException("List is Empty");
		}
		while (!nodeData.equals(ID)) {
			currNode = currNode.getNext();
		}

		currNode.setNext(null);
		return currNode.getData();
	}

	// traverse the linked list and print all nodes and data
	public void printAllRecords() {
		Node<T> currNode = head;
		// while the currentNode is not empty print the value of the current node then
		// get next
		while (currNode != null) {
			System.out.println(currNode.getData());
			currNode = currNode.getNext();
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return head == null;
	}
}
