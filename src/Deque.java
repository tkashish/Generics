
public interface Deque<T> {
	int size();
	boolean isEmpty();
	T getLast();
	T getFront();
	T removeFront();
	T removeLast();
	void insertFront(T obj);
	void insertLast(T obj);
}
