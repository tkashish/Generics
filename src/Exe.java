
public class Exe {

	public Exe() {
	}

	public static void main(String[] args) {
		Stack<String> sI = new StackImp<String>();
		sI.push("1");
		sI.push("2");
		sI.push("3");
		sI.push("4");
		sI.push("5");
		System.out.println(sI.size());
		System.out.println(sI.top());
		System.out.println(sI.pop());
		System.out.println(sI.size());
		System.out.println(sI.top());
		System.out.println(sI.pop());
		System.out.println(sI.size());
		System.out.println(sI.top());
		System.out.println(sI.pop());
		System.out.println(sI.size());
		System.out.println(sI.top());
		System.out.println(sI.pop());
		System.out.println(sI.size());
		System.out.println(sI.top());
		System.out.println(sI.pop());
		System.out.println(sI.size());

	}

}
