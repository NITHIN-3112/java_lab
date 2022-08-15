class Data
{
public int x;
private boolean flag=false;
public synchronized void get()
{
	if(flag==false)
	{
		try{
		this.wait();
		}
		catch(InterruptedException e)
		{
		e.printStackTrace();
		}
	}
	
System.out.println("consumer" + x);
flag=false;
notify();
	
}
public synchronized void put(int x)
{
	if(flag==true)
	{
		try{
		this.wait();
		}
		catch(InterruptedException e)
		{
		e.printStackTrace();
		}
	}
this.x=x;
System.out.println("producer" + x);
flag=true;
notify();
}
}
class Producer1 extends Thread
{
	Data d;
	public Producer1(Data d)
	{
		this.d=d;
		this.start();
	}
	@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			d.put(i);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Consumer1 extends Thread
{
	Data d;
	public Consumer1(Data d)
	{
		this.d=d;
		this.start();
	}@Override
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			d.get();
			try
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class ProducerConsumer extends Thread
{
	public static void main(String args[])
	{
		new ProducerConsumer();
		Data d = new Data();
		Producer1 p = new Producer1(d);
		Consumer1 c = new Consumer1(d);
	}
}
	

	
	