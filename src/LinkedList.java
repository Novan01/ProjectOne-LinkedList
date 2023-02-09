
//Linked List class
import java.io.*;

//custom singly linked list class that impplements IDedObject interface
public abstract class LinkedList<T> implements IDedObject<T> {
	Node<T> head;

	static class Node<T> {
		int data;
		Node<T> next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public LinkedList() {
		head = null;
	}

	// clear out the whole linked list
	public void makeEmpty() {

	}

	// traverse the linked list to find node with ID ID
	public T findID(int ID) {
		return null;

	}

	// insert node at the fron
	public boolean insertAtFront(Node<T> x) {
		Node<T> new_head = x; // new head node is the node we want to inset
		new_head.next = null; // the pointer to the next is now pointing at old head

		// if there is no head node
		if (head == null) {
			head = new_head;
		}
		// else, traverse the list to find the next place to put the old head node
		else {
			Node<T> last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_head;
		}
		return true;
	}

	// delete front node
	public T deleteFromFront() {
		return null;
	}

	// delete node with ID - int ID
	public T delete(int ID) {
		Node<T> deleteNode = new Node<T>(ID); // create node for what we want to delete
		deleteNode.next = null;

		Node<T> currNode = head;

		while (currNode != null) {
			if (currNode.data == deleteNode.data) {
				currNode = null;
			}
		}
		return null;
	}

	// traverse the linked list and print all nodes and data
	public void printAllRecords() {
		Node<T> currNode = head;
		Node<T> nextNode = head.next;
		while (currNode != null) {
			System.out.println(currNode);
			currNode = nextNode;
			nextNode = nextNode.next;
		}
	}

}
