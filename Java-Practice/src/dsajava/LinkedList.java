package dsajava;
public class LinkedList { 
    // Create Node in linked list	
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	// Head and Tail of linked list
	public static Node head;
	public static Node tail;
	public static int size;
	// addFirst() method 
	public void addFirst(int data) {
		// step1- create a new node
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		// step2- newNode next=head
		newNode.next=head;
		// step3- head= newNode
		head=newNode;
	}
	public void addLast(int data) {
		// step1- create a new node
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}
		// step2- newNode next=head
		tail.next=newNode;
		// step3- head= newNode
		tail=newNode;
	}
	// Print a linked list
	public void print() {
		Node temp=head;
		if(temp==null) {
			System.out.println("null");
			return;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	// Add in the middle of ll
	public void add(int idx,int data) {
		if(idx==0) {
			addFirst(data);
			return;
		}
		Node newNode=new Node(data);
		size++;
		Node temp=head;
		int i=0;
		while(i<idx-1) {
			temp=temp.next;
			i++; 
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	// Remove First
	public int removeFirst() {
		if(head==null) {
			System.out.println("Empty");
		}else if(head.next==null) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		int val=head.data;
		head=head.next;
		size--;
		return val;
	}
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addFirst(1);
		list.addFirst(2);
		list.addLast(3);
		list.addLast(4);
		list.print();
		list.add(0, 8);
		list.print();
		System.out.println(list.size);
		System.out.println(list.removeFirst());
		list.removeFirst();
		list.removeFirst();
		list.removeFirst();
		list.removeFirst();
		list.print();
		System.out.println(list.size);
		
	}
	
}