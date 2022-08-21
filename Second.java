package thread;

public class Second extends Thread {
	Table t;
	Second(Table t)
	{
		this.t=t;
	}

	public void run()
	{
		t.multiplication(10);
		try
		{
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}



	

	
}
