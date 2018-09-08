package Demo_Join_Alive;

public class Demo_Join_Alive {
	public static void main(String args[]) {
		my_thread t1 = new my_thread("t1"); 
		my_thread t2 = new my_thread("t2");
		my_thread t3 = new my_thread("t3");
		System.out.println("Thread "+t1.name+" "+t1.t.isAlive());
		System.out.println("Thread "+t2.name+" "+t2.t.isAlive());
		System.out.println("Thread "+t3.name+" "+t3.t.isAlive());
		try {
			t1.t.join();
			t2.t.join();
			t3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Exception Main");
		}
		System.out.println(t1.t.isAlive());
		System.out.println(t2.t.isAlive());
		System.out.println(t3.t.isAlive());
		System.out.println("Main End");
	}
}
