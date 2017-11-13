package com.infy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
 * This class is for creating own stack
 * @author Sarvesh Yadav
 * 
 * */
public class MyStack {

	/*
	 * inner class of stack
	 */
	class Stack {
		private int initialLen = 10;
		private Object array[];
		private int index = 0;
		private int size = 0;

		public boolean push(final Object val) {
			if (size > initialLen - 1) {
				array = java.util.Arrays.copyOf(array, array.length * 2,
						Object[].class);
			}
			array[index] = val;
			index++;
			size++;
			return true;
		}

		public Stack() {
			array = new Object[initialLen];
		}

		public Stack(int size) {
			array = new Object[size];
		}

		public boolean pop() {
			if (size >= 0) {
				array[size-1] = null;
				size--;
				return true;
			} else {
				return false;
			}

		}

		public Object[] getStack() {
			return array;
		}

		public int size() {
			return size;
		}

		public Object get(int index) {
			return array[index];
		}

		public boolean contains(Object o) {
			return indexOf(o) >= 0;
		}

		private int indexOf(Object o) {
			if (o == null) {
				for (int i = 0; i < size; i++)
					if (array[i] == null)
						return i;
			} else {
				for (int i = 0; i < size; i++)
					if (o.equals(array[i]))
						return i;
			}
			return -1;
		}

		public Object remove(int index) {

			if (index >= size)
				throw new ArrayIndexOutOfBoundsException(index);
			Object oldValue = array[index];

			int numMoved = size - index - 1;
			if (numMoved > 0)
				System.arraycopy(array, index + 1, array, index, numMoved);
			array[--size] = null; // Let gc do its work

			return oldValue;

		}

		public boolean remove(Object o) {
			return false;

		}

		@Override
		public String toString() {
			return "Stack [array=" + Arrays.toString(array) + ", index="
					+ index + ", size=" + size + "]";
		}

	}

	public static void main(String[] args) {
		MyStack.Stack stack = new MyStack().new Stack();
		stack.push(154);
		stack.push("wecwe");
		stack.push(15488);
		stack.push("wecwe");
		stack.push(154);
		stack.push("wecwe");
		stack.push(154);
		stack.push("wecwe");
		stack.push(154);
		stack.push("wecwe");
		stack.push(15488);
		stack.push(154444);
		stack.pop();
		stack.remove(2);
		stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.pop();
		// stack.

		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.getStack()[i]);
		}
		System.out.println(stack.size());
		System.out.println("?????????????????????????????");
		System.out.println(stack.get(2));
		System.out.println(stack.contains(25));
		System.out.println(stack.contains(154444));
		System.out.println(stack.contains(15488));
		java.util.Stack s = new java.util.Stack();
		// System.out.println(s.remove(0));
		;

		// System.out.println(stack);
		// List<Object> list = new ArrayList<>(10);
		// list.add(5411);
		// System.out.println(list.contains(154444));
	}
}
