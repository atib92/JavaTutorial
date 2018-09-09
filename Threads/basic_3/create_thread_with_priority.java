package thread_priority;

public class create_thread_with_priority implements Runnable {
	long clicks = 0;
	Thread t;
	//volatile will prevent OS from optimizing
	volatile boolean is_running = true;
	create_thread_with_priority(int p,String name) {
		t = new Thread(this,name);
		t.setPriority(p);
		t.start();
	}
	public void run() {
		while(is_running) {
			clicks ++;
			//System.out.println(clicks);
		}
	}
	public void stop() {
		is_running = false;
	}
}
