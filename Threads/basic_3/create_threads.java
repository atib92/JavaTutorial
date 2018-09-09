package thread_priority;

public class create_threads {
	public static void main (String args[]) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		create_thread_with_priority t1 = new create_thread_with_priority(Thread.NORM_PRIORITY+2,"H");
		create_thread_with_priority t2 = new create_thread_with_priority(Thread.NORM_PRIORITY-2,"L");	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Main Caught exception");
	    }
		t1.stop();
		t2.stop();
		try {
			t1.t.join();
			t2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main II Caught exception");
		}
		System.out.println(t1.t.getName()+" "+t1.clicks);
		System.out.println(t2.t.getName()+" "+t2.clicks);
		System.out.println("Main End");
	}
}
