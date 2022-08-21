package thread;

public class Demo1 implements Runnable{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("hai");
		}
		try {
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	

	



}
