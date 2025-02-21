package week1.day4;

public class Misnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number[]= {1,4,3,2,8,6,7};
System.out.println(number.length);
for (int i=0;i<=number.length;i++)
{
	for (int j=i+1;j<number.length;j++)
	{
		if (number[i]>number[j])
		{
			int k=number[i];
			number[i]=number[j];
			number[j]=k;
		}
	}
}

System.out.println("ascending order" );
for(int i=0;i<number.length;i++)
	{
	System.out.println( number[i]);
	}

int n=number.length;
int sum=(n+1)*(n+2)/2;

for(int i=0;i<number.length;i++)
{
	
		sum=sum-number[i];
	
	
}
System.out.println("Missing number" + sum);
	}

}
