import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestArrayDeque {

	public static void main(String[] args) {

		Queue<Object> q = new PriorityQueue<Object>();
		q.add("ed");
		// For a capacity-constrained queue, the difference is that add() always
		// returns true and throws an exception if it can't add the element,
		// whereas offer() is allowed to return false if it can't add the
		// element. However, this doesn't apply to PriorityQueue ; the two
		// functions are synonymous.
		Deque<Object> dq = new ArrayDeque<>();
		dq.add("dwd");
		dq.offer("fff");
		dq.offer("ffftyj");
		dq.offer("fyjjff");
		dq.offer("ffyjf");
		dq.push("sarvesh");
		System.out.println(dq);
	}
}
