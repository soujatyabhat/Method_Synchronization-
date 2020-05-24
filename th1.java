package mutual_ex;

public class th1 extends Thread
{
	rec obj = new rec();
	th1(rec obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.febo(20);
	}
}
