package week1.day4;

public class Anagramchkstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
String str1="stops";
String str2="potss";
int len1=str1.length();
int len2=str2.length();
if (len1!=len2)
{
	System.out.println("Length not mathing");
}
else
{
char[] arr1=str1.toCharArray();
char[] arr2=str2.toCharArray();

for(int i=0;i<arr1.length;i++)
{ 
	for(int j=i+1;j<arr1.length;j++)
    {
	if (arr1[i]>arr1[j])
		
		
{
	char temp=arr1[i];
	arr1[i]=arr1[j];
	arr1[j]=temp;
}
    }
}
for(int i=0;i<arr1.length;i++)
{ 
	System.out.print(arr1[i]);

    
}
System.out.println("");
for(int i=0;i<arr2.length;i++)
{ for(int j=i+1;j<arr2.length;j++)
    {
	if (arr2[i]>arr2[j])
{
    char temp=arr2[i];
	arr2[i]=arr2[j];
	arr2[j]=temp;
}
    }
}
for(int i=0;i<arr2.length;i++)
{ 
	System.out.print(arr2[i]);

    
}
boolean flag=true;

for(int i=0;i<arr1.length;i++)
{

	
	
		if (arr1[i]!=arr2[i])
				{
	           flag = false;  
	           break;
				}
		
}

if(flag)
{
	System.out.println(""
			+ " anagram strings");
	}
else
{
	System.out.println("not anagram strings");
}
}

	
}
	
}
