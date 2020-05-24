package mutual_ex;

public class mutual_ex 
{
	public static void main(String[] args)
	{
			rec resouce  = new rec();
			th1 trd1 = new th1(resouce);
			th2 trd2 = new th2(resouce);
			trd1.start();
			trd2.start();
	}

}
