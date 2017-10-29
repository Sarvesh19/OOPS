import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {
	
	public static List<Object> getList(){
		List<Object> c = new ArrayList<>();
		c.add(145);
		c.add("sarvesh");
		c.add("parvesh");
		c.add(true);
		c.add('c');
		c.add("sarvesh");
		c.add("sarvesh");
		c.add(25.2514D);
		return c;
	}

	public static void main(String[] args) {
		List<Object> c =getList();

		Iterator<Object> i = c.iterator();
		//System.out.println(c.remove(0));
		ListIterator ltr = c.listIterator();
		// List interface has listIterator() so because of that we cant use
		// Collection as interface listIterator uses for the backword and
		// forward

		if (c.contains("sarvesh")) {
			System.out.println("Yes it contains at index "
					+ c.indexOf("sarvesh"));
		}
		// or

		if (c.indexOf("sarvesh") > -1) {
			System.out.println("sarvesh hai");
			System.out.println(c.lastIndexOf("sarvesh"));
			
			try {
				System.out.println(c.get(-25));	
			} catch (Exception e) {
				// TODO: handle exception
				//System.out.println(e);
			}
			
		} else {
			System.out.println("sarvesh nahi hai");
		}
//		if(c.lastIndexOf("sarvesh")){
//			
//		}

		while (ltr.hasNext()) {
			System.out.println(ltr.next());
			// if()

			// System.out.println(ltr.previous());
		}

//		System.out.println("--------------------");
//
//		while (ltr.hasPrevious()) {
//			System.out.println(ltr.previous());
//		}
//
//		System.out.println("--------------------");
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}

	}
}
