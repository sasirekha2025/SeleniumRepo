package week1.day4;

public class Oddindexstrchng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcdef";
char[] myArray = str.toCharArray();
for (int i = 0; i < str.length(); i++)
{
	 
    if (i % 2 == 1)
    {
      System.out.print(myArray[i]);
	}

}
}
}