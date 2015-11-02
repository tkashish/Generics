
public interface Queue<T> {
	int size();
	boolean isEmpty();
	T front();
	T dequeue();
	void enqueue(T obj);
}
