package week1.day3;

public class FibonocciSeries 
{
	 static void Fibonocci(int N)
	    {
	        int num1 = 0, num2 = 1;

	        for (int i = 0; i < N; i++) {
	           
	            System.out.print(num1 + " ");

	 	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	        }
	    }
	public static void main(String[] args)
	{
		
    int number = 8;
    FibonocciSeries fibnum = new FibonocciSeries();
    fibnum.Fibonocci(number);
	}

}
