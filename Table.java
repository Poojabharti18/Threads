package thread;

public class Table {
	public synchronized void multiplication(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}

}
