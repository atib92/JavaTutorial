package sync;

public class print_me {
	public synchronized void print(String msg_1, String msg_2) {
		System.out.print(msg_1);
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			System.out.println("Interrupted ");
		}
		System.out.println(" "+msg_2);
	}
}
