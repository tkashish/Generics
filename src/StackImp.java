
public class StackImp<T> implements Stack<T> {
	private Deque<T> deque;
	public StackImp() {
		deque = new DequeImp<T>();
	}

	@Override
	public int size() {
		return deque.size();
	}

	@Override
	public boolean isEmpty() {
		return deque.isEmpty();
	}

	@Override
	public T pop() {
		return deque.removeFront();
	}

	@Override
	public T top() {
		return deque.getFront();
	}

	@Override
	public void push(T obj) {
		deque.insertFront(obj);
	}

}
