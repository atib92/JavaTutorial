public class MainThread {
    public static void main(String[] args) {
        new NewThread();
        new NewThread_II();
        try {
            for(int i=0;i<5;i++) {
                System.out.println("MainThread " + i);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread interuppted");
        }
        System.out.println("Main Ended");
    }
}