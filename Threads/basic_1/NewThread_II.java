public class NewThread_II extends Thread {
	NewThread_II() {
		super("child_thread2");
		System.out.println("Cons child_thread2");
		start();
	}
	public void run() {
		System.out.println("Start Running child_thread2");
        try {
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread());
                System.out.println("Child2:"+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child_thread2 interuppted");
        }
        System.out.println("child_thread2  Ended");
	}
}
