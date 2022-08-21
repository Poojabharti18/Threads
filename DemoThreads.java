package thread;

public class DemoThreads extends Thread{

	
		public void run()
		{
			System.out.println("hello");
		
		try
		{
			
		Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		}


		 public static void main(String[] args) 
		 {
			 DemoThreads d=new DemoThreads();
			 d.setName("First");
			  System.out.println(d.getName());
			  d.start();
		 

			  try
			  {
				  d.join();
			  }
			  catch (Exception e)
			  {
				  
			  }
			  DemoThreads d1=new DemoThreads();
			  d1.setName("Second");
			  System.out.println(d1.getName());
			  d1.start();
			  }
}

	
		

