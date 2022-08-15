import java.util.Random;

class Even implements Runnable

{
    int x;
	public Even(int x){
		this.x=x;
	}
	@Override
	  public void run()
	  {
		  System.out.println("thread name:  odd thread is" + x*x*x);
	  }
}
 class Odd implements Runnable
 {
	 int x;
	public Odd(int x){
	this.x=x;}
	 @Override
	  public void run()
	  {
		  System.out.println("thread name: Even thread is " + x*x);
	  }

 }

  class EvenOdd extends Thread
  {
	  @Override
	  public void run()
	  {
		  Random r = new Random();
	  for(int i =1;i<=10;i++)
	  {
		  int num = r.nextInt(100);
           System.out.println("Main thread generated number is"+num);
         if (num%2==0){
			 Thread t1 = new Thread(new Even(num));
			 t1.start();
		    }
		   else
		   {
			   Thread t2 = new Thread(new Odd(num));
			   t2.start();
		   }
		   try
		   {
			   Thread.sleep(1000);
			   System.out.println("-----------------------------------------");
		   }
		   catch(InterruptedException e){
		   e.printStackTrace();}
	    }
	}

 public static void main(String args[])
 {
	EvenOdd n = new EvenOdd();
	n.start();
 }
}