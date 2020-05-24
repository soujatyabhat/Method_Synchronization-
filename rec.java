package mutual_ex;

public class rec extends Thread
{
	synchronized void febo(int n) 
	{
		int a,b,sum,i;
		sum = 0;
		a = 0;
		b = 1;
		try 
		{
		System.out.print("Series is : ");
		for(i = 0; i<n; i++)
		{
			sleep(1000);
			System.out.print(a + " ");
			sum = a + b;
			a = b;
			b = sum;
		}
		}
		catch(Exception obj)
		{
			System.out.print(obj);
		}
		System.out.print("\n");
	}
}
