package week1.day4;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Chkintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {3,2,11,4,6,7};
int arr2[]= {1,2,8,4,9,7};

for (int i=0;i<=arr1.length;i++)
{
	for (int j=i+1;j<arr1.length;j++)
	{
		if (arr1[i]>arr1[j])
		{
			int k=arr1[i];
			arr1[i]=arr1[j];
			arr1[j]=k;
		}
	}
}
for (int i=0;i<=arr2.length;i++)
{
	for (int j=i+1;j<arr2.length;j++)
	{
		if (arr2[i]>arr2[j])
		{
			int k=arr2[i];
			arr2[i]=arr2[j];
			arr2[j]=k;
		}
	}
}
System.out.println("The common numbers are");
for(int i=0;i<arr1.length;i++)
{
	for(int j=0;j<arr2.length;j++)
	{
		if (arr1[i]==arr2[j])
		{
			System.out.println(arr1[i]);
		}
	}
}
	}

}
