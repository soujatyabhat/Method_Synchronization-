package mutual_ex;

public class th2 extends Thread
{
	rec obj = new rec();
	th2(rec obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.febo(10);
	}
}
