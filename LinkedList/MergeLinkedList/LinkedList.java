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
	public void swap(int x,int y) {
		System.out.println("\nswap: "+x+" "+y);
		if(x == y) {
			System.out.println("\nx and y are same ");
			return;
		}
		//First traverse the LL and locate the 2 parents
		node p_x = null;
		node p_y = null;
		node c_x = head;
		
		while(c_x != null && c_x.data != x) {
			p_x = c_x;
			c_x = c_x.next;
		}
		node c_y = head;
		while(c_y != null && c_y.data != y) {
			p_y = c_y;
			c_y = c_y.next;
		}
		if(p_x == null) {
			head = c_y;
		} else {
			p_x.next = c_y;
		}
		if(p_y == null) {
			head = c_x;
		} else {
			p_y.next = c_x;
		}
		node temp = c_x.next;
		c_x.next = c_y.next;
		c_y.next = temp;
	}
	public void reverse() {
		//Given a-b-c-d-e, convert to e-d-c-b-a
		System.out.println("\nReverse:");
		node p_x = null;
		node x   = head;
		node temp;
		while(x != null) {
			temp = x.next;
			x.next = p_x;
			p_x = x;
			x = temp;
		}
		head = p_x;
	}
	public void traverse() {
		System.out.println("\ntraverse:");
		node n = this.head;
		while(n != null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		return;
	}
	public static void main(String args[]) {
		LinkedList a = new LinkedList();
		LinkedList b = new LinkedList();
		a.Add(1);a.Add(3);a.Add(5);a.Add(7);a.Add(9);
		b.Add(0);b.Add(2);b.Add(4);b.Add(6);b.Add(8);
		merger my_merger = new merger(a,b);
		LinkedList c = my_merger.merge(a,b);
		c.traverse();
	}
}
