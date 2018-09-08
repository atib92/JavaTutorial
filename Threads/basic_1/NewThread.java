public class NewThread implements Runnable {
    NewThread () {
        System.out.println("Cons child_thread1");
        Thread new_thread = new Thread(this,"child_thread1");
        new_thread.start();
    }
    public void run() {
        System.out.println("Start Running child_thread1");
        try {
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread());
                System.out.println("Child1:"+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("child_thread1 interuppted");
        }
        System.out.println("child_thread2 Ended");
    }
}