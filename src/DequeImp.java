
public class DequeImp<T> implements Deque<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size;
	public DequeImp() {
		head = new Node<T>(null,null,null);
		tail = new Node<T>(null,null,null);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		if(size == 0){
			return false;
		}
		return true;
	}

	@Override
	public T getLast() {
		if(size == 0){
			System.out.println("list is empty");
			return null;
		}
		return tail.getPrev().getData();
	}

	@Override
	public T getFront() {
		if(size == 0){
			System.out.println("list is empty");
			return null;
		}
		return head.getNext().getData();
	}

	@Override
	public T removeFront() {
		if(size == 0){
			System.out.println("list is empty");
			return null;
		}
		Node<T> front = head.getNext();
		head.setNext(front.getNext());
		this.size--;
		return front.getData();
	}

	@Override
	public T removeLast() {
		if(size == 0){
			System.out.println("list is empty");
			return null;
		}
		Node<T> last = tail.getPrev();
		tail.setPrev(last.getPrev());
		this.size--;
		return last.getData();
	}

	@Override
	public void insertFront(T obj) {
		Node<T> node = new Node<T>(obj, null, null);
		if(head.getNext() == null){
			head.setNext(node);
			node.setPrev(head);
			node.setNext(tail);
			tail.setPrev(node);
		}else{
			node.setNext(head.getNext());
			head.getNext().setPrev(node);
			node.setPrev(head);
			head.setNext(node);
		}
		this.size++;
	}

	@Override
	public void insertLast(T obj) {
		Node<T> node = new Node<T>(obj, null, null);
		if(tail.getPrev() == null){
			tail.setPrev(node);
			node.setNext(tail);
			node.setPrev(head);
			head.setNext(node);
		}else{
			tail.getPrev().setNext(node);
			node.setPrev(tail.getPrev());
			node.setNext(tail);
			tail.setPrev(node);
		}
		this.size++;
	}

}
