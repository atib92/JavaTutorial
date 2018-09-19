package sync;

public class sync {
    public static void main(String args[]) {
    	print_me p_me = new print_me();
    	String one = "Cristiano Ronaldo";
    	String two = "is the best";
    	String three = "soccer player";
    	String four = "in the history";
    	p_msg a = new p_msg(one,two,p_me);
    	p_msg b = new p_msg(three,four,p_me);
    	try {
    		a.t.join();
    		b.t.join();
    	} catch(InterruptedException e) {
    		System.out.println("Main Interuupted");
    	}
    	System.out.println("Main End ");
    }
}
