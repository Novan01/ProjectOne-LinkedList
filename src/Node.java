//custom node class
import java.io.*;

public class Node<T> {
	//abstract data members
	T data; //abstract data
	Node<T> next; //next node pointer
	
	Node(T data) {
		this.data = data;
		this.next = null;
	}
}
