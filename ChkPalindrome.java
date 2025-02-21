package week1.day4;

public class ChkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num=656;
 int num1 =num;
 int revnum=0;
 while (num1>0)
 {
	 revnum=revnum*10+num1%10;
	 num1=num1/10;
 }

 if(num==revnum)
 {
 System.out.println("The number is a palindrome ");
	}
 else
 {
	 System.out.println("The number is not a palindrome");
 }

}
}