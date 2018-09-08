public class NewThread_II extends Thread {
	NewThread_II() {
		System.out.println("New Thread II cons");
		start();
	}
	public void run() {
		System.out.println("Start Running child II thread");
        try {
            for(int i=0;i<5;i++) {
                System.out.println("NewThread II" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("New Thread II interuppted");
        }
        System.out.println("New Thread II  Ended");
	}
}
