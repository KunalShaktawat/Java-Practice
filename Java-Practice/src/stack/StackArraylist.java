package stack;

import java.util.ArrayList;

class Stack{
	ArrayList<Integer> list=new ArrayList<>();
	// push
	public void push(int data) {
		list.add(data);
	}
	// pop
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int top=list.get(list.size()-1);
		list.remove(list.size()-1);
		return top;
	}
	// peek
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		int top=list.get(list.size()-1);
		return top;
	}
	// isEmpty
	public boolean isEmpty() {
		return list.size()==0;
	}
}
public class StackArraylist {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
