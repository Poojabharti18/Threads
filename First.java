package thread;

public class First extends Thread {
Table t;
public First(Table t)
{
	this.t=t;
}
public void run()
{
	t.multiplication(5);

try {
	Thread.sleep(2000);
}
catch(Exception e)
{
	System.out.println(e);
}
}
}
