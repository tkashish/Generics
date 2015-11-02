
public class Node<T> {
	private T data;
	private Node<T> prev;
	private Node<T> next;
	private int number;
	public Node(T d, Node<T> p, Node<T> n) {
		this.setData(d);
		this.setPrev(p);
		this.setNext(n);
		this.number = -1; // head and tail node
	}
	public Node(T d, Node<T> p, Node<T> n, int num) {
		this.setData(d);
		this.setPrev(p);
		this.setNext(n);
		this.number = num;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getPrev() {
		return prev;
	}
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
