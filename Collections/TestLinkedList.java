import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//ArrayList Vs LinkedList
//
//1) Search: ArrayList search operation is pretty fast compared to the LinkedList search operation. get(int index) in ArrayList gives the performance of O(1) while LinkedList performance is O(n).
//
//Reason: ArrayList maintains index based system for its elements as it uses array data structure implicitly which makes it faster for searching an element in the list. On the other side LinkedList implements doubly linked list which requires the traversal through all the elements for searching an element.
//
//2) Deletion: LinkedList remove operation gives O(1) performance while ArrayList gives variable performance: O(n) in worst case (while removing first element) and O(1) in best case (While removing last element).
//
//
// 
//Conclusion: LinkedList element deletion is faster compared to ArrayList.
//
//Reason: LinkedListís each element maintains two pointers (addresses) which points to the both neighbor elements in the list. Hence removal only requires change in the pointer location in the two neighbor nodes (elements) of the node which is going to be removed. While In ArrayList all the elements need to be shifted to fill out the space created by removed element.
//
//3) Inserts Performance: LinkedList add method gives O(1) performance while ArrayList gives O(n) in worst case. Reason is same as explained for remove.
//
//4) Memory Overhead: ArrayList maintains indexes and element data while LinkedList maintains element data and two pointers for neighbor nodes hence the memory consumption is high in LinkedList comparatively.
//
//There are few similarities between these classes which are as follows:
//
//Both ArrayList and LinkedList are implementation of List interface.
//They both maintain the elements insertion order which means while displaying ArrayList and LinkedList elements the result set would be having the same order in which the elements got inserted into the List.
//Both these classes are non-synchronized and can be made synchronized explicitly by using Collections.synchronizedList method.
//The iterator and listIterator returned by these classes are fail-fast (if list is structurally modified at any time after the iterator is created, in any way except through the iteratorís own remove or add methods, the iterator will throw a ConcurrentModificationException).
//When to use LinkedList and when to use ArrayList?
//
//1) As explained above the insert and remove operations give good performance (O(1)) in LinkedList compared to ArrayList(O(n)). Hence if there is a requirement of frequent addition and deletion in application then LinkedList is a best choice.
//
//2) Search (get method) operations are fast in Arraylist (O(1)) but not in LinkedList (O(n)) so If there are less add and remove operations and more search operations requirement, ArrayList would be your best bet.

public class TestLinkedList {
	public static void main(String[] args) {
		List<Object> list = new LinkedList<Object>();
		List<Object> listStack = new Stack<>();
//		Stack s = new Stack<>();
//		s.add("sar");
//		s.add("85");
//		s.add(145);
//		System.out.println(s);
		
		
		list.add("seee");
		list.add("goti");
		list.add(520);

		list.add(3, 52);
		list.addAll(TestArrayList.getList());

		// list.remove(2);
		Iterator<Object> itr = list.iterator();
		// itr.remove();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("============");

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al2.add("Ajay");
		al.retainAll(al2);
		System.out
				.println("iterating the elements after retaining the elements of al2...");
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		listStack.add(250);
		listStack.add(150);
		listStack.add("seee");
		listStack.add("150");
		
		
		
		System.out.println(listStack);

	}
}
