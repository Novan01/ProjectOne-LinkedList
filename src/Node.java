public class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T d) {
        this.data = d;
        next = null;
    }

    // method to get the data of the node
    public T getData() {
        return data;
    }

    // method to set node data
    public void setData(T data) {
        this.data = data;
    }

    // method to get next node pointer
    public Node<T> getNext() {
        return next;
    }

    // method to set next node pointer
    public void setNext(Node<T> next) {
        this.next = next;
    }

    // method to convert data to string
    public String toString() {
        return data.toString();
    }
}