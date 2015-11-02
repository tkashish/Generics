
public class QueueImp<T> implements Queue<T> {
	private Deque<T> deque;
	public QueueImp() {
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
	public T front() {
		return deque.getFront();
	}

	@Override
	public T dequeue() {
		return deque.removeFront();
	}

	@Override
	public void enqueue(T obj) {
		deque.insertLast(obj);
	}

}
