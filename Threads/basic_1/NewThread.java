public class NewThread implements Runnable {
    NewThread () {
        System.out.println("Cons NewThread Thread");
        Thread new_thread = new Thread(this,"child_thread");
        new_thread.start();
    }
    public void run() {
        System.out.println("Start Running child thread");
        try {
            for(int i=0;i<5;i++) {
                System.out.println("NewThread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("New Thread interuppted");
        }
        System.out.println("New Thread Ended");
    }
}