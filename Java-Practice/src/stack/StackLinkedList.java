package stack;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class Stack2{
	static Node head;
	// push
	public void push(int data) {
		Node newNode=new Node(data);
//		if(head==null) {
//			head=newNode;
//            
//		}
		newNode.next=head;
		head=newNode;
	}
	// pop
	public int pop() {
		if(head==null) {
			return -1;
		}
		int top=head.data;
		head=head.next;
		return top;
	}
	// peek
	public int peek() {
		if(head==null) {
			return -1;
		}
		return head.data;
	}
	// isEmpty
	public boolean isEmpty() {
		return head==null;
	}
}
public class StackLinkedList {
	public static void main(String[] args) {
		Stack2 s=new Stack2();
		s.push(10);
		s.push(20);
		s.push(30);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
