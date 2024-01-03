package Test;


public class MultiThreading extends Thread 
{
    
    public void run()
    {
        for (int i=0;i<10;i++)
        {
        System.out.println(i);
        
        }
        System.out.println(Thread.currentThread().getId() +" "+ "Thread");
    }
	public static void main(String[] args) {
	    
		MultiThreading m = new MultiThreading();
	    Thread t1 = new Thread(m);
	    t1.start();
	    Thread t2 = new Thread(m);
	    t2.start();
		
	}
}
