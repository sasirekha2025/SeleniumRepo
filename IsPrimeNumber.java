package week1.day3;

public class IsPrimeNumber 
{
	
 void Prime (int number)
 {
	 int temp;
	 boolean flag=true;
if(number==0 || number==1)
{
	System.out.println("The number is not prime");
}
if(number==2)
{
	System.out.println("The number is a prime number");
}
if (number >2)
{
 	for(int i=2;i<=number/2;i++)
 		{
 		temp=number%i;
 			if(temp==0)  
 			{ 
 			flag=false;
 			break;
 			}
 		}	    
}
if( flag==false)
{
	System.out.println("The number is not a prime number"+ number);
}
else 
{
	System.out.println("The number is a prime number"+ number);
}
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N=13;
IsPrimeNumber primenum= new IsPrimeNumber();
primenum.Prime(N);
	}
}