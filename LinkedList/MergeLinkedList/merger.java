package LinkedList;

public class merger {
	merger(LinkedList a,LinkedList b) {
		a.traverse();
		b.traverse();
	}
	public LinkedList merge(LinkedList a,LinkedList b) {
		System.out.println("\nMerger\n:");
		LinkedList c = new LinkedList();
		node n_a = a.head;
		node n_b = b.head;
		while(n_a != null && n_b !=null) {
			if(n_a.data < n_b.data) {
				c.Add(n_a.data);
				n_a = n_a.next;
			} else {
				c.Add(n_b.data);
				n_b = n_b.next;
			}
		}
		if(n_a != null) {
			while(n_a != null) {
				c.Add(n_a.data);
				n_a = n_a.next;
			}
		}
		if(n_b != null) {
			while(n_b != null) {
				c.Add(n_b.data);
				n_b = n_b.next;
			}
		}
		return c;
	}
}
