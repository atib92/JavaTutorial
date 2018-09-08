package Demo_Join_Alive;

public class my_thread implements Runnable {
	Thread t;
	String name;
	my_thread(String t_name) {
		name = t_name;
		t = new Thread(this,name);
		t.start();
	}
	public void run () {
		try {
			for(int i = 0;i<5;i++) {
				System.out.println("Child " + name + " " +i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Exception");
		}
		System.out.println("Child Thread end");
	}
}