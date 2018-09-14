package LinkedList;

public class LinkedList {
	node head;
	LinkedList() {
		System.out.println("Creating LL ");
	}
	//Methods:
	public void Add(int data) {
		System.out.println("Add: "+data);
		node new_node  = new node();
		new_node.data = data;
		new_node.next = null;
		//Case
		if(this.head == null) {
			this.head = new_node;
		} else {
			node n = this.head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = new_node;
		}
		return;
	}
	public void Del(int data) {
		System.out.println("Del: "+data);
		node n = this.head;
		node p = null;
		if(n.data == data) {
			this.head = head.next;
		} else {
			while(n != null && n.data != data) {
				p = n;
				n = n.next;
			}
			if(n != null) {
				p.next = n.next;
			}
		}
		return;
	}
	public void traverse() {
		System.out.println("traverse:");
		node n = this.head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		return;
	}
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.Add(10);ll.Add(15);ll.Add(20);ll.Add(25);
		ll.traverse();
		ll.Del(15);
		ll.traverse();
		ll.Del(10);
		ll.traverse();
		ll.Del(25);
		ll.traverse();
	}
}
