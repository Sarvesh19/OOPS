import java.util.LinkedList;
import java.util.Queue;

public class TestLinkedListQueue {
	public static void main(String[] args) {
		System.out.println(System.nanoTime());;
		Queue<Object> queueList = new LinkedList<>();
		queueList.add("dwed");
		queueList.add(145);
		queueList.add(4200);
		queueList.add("sarvesh");

		System.out.println(queueList);
		
		System.out.println(queueList.containsAll(TestArrayList.getList()));;
		
		System.out.println(queueList.poll());;
		System.out.println(queueList);
		System.console();
		System.out.println(System.nanoTime());;
	}
}
