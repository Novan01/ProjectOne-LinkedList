
//Linked List class
import java.io.*;

//custom singly linked list class that impplements IDedObject interface
public abstract class LinkedList<E> implements IDedObject {
	public Node<E> head;

	public LinkedList() {
		head = null;
	}

	// clear out the whole linked list
	public void makeEmpty() {

	}

	// traverse the linked list to find node with ID ID
	public E findID(int ID) {
		return null;

	}

	// insert Node<E> at the fron
	public boolean insertAtFront(E x) {
		Node<E> new_head = new Node(x); // new head node is the node we want to inset
		new_head.setNext(null); // the pointer to the next is now pointing at old head

		// if there is no head node
		if (head == null) {
			head = new_head;
		}
		// else, traverse the list to find the next place to put the old head node
		else {
			Node<E> last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(new_head);
		}
		return true;
	}

	// delete front node
	public E deleteFromFront() {
		return null;
	}

	// delete node with ID - int ID
	public E delete(int ID) {
		Node<E> deleteNode = new Node(ID); // create node for what we want to delete
		deleteNode.setNext(null);

		Node<E> currNode = head;

		while (currNode != null) {
			if (currNode.getData() == deleteNode.getData()) {
				currNode = null;
			}
		}
		return null;
	}

	// traverse the linked list and print all nodes and data
	public void printAllRecords() {
		Node<E> currNode = head;
		Node<E> nextNode = head.getNext();
		while (currNode != null) {
			System.out.println(currNode);
			currNode = nextNode;
			nextNode = nextNode.getNext();
		}
	}

}
