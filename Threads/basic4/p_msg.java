package sync;

public class p_msg implements Runnable {
    Thread t;
    String my_msg_1,my_msg_2;
    print_me p_me_local;
    p_msg(String msg_1, String msg_2, print_me p_me) {
    	my_msg_1 = msg_1;
		my_msg_2 = msg_2;
		p_me_local = p_me;
		t = new Thread(this);
		t.start();
    }
	public void run() {
		p_me_local.print(my_msg_1,my_msg_2);
	}
}
