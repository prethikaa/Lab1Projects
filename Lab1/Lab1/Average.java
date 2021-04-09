package Lab1;
import java.util.Scanner;
public class Average {
	

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);    
	int n;
	System.out.println("Enter the value of n");
	   n=sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter all values");
	for(int i=0;i<n;i++)
	{
	arr[i] = sc.nextInt();
	}
	Average a = new Average();
	float avg=a.calcavg(arr,n);
	System.out.println("Average is "+avg);
	   
	}

	public float calcavg(int[] array,int n)
	{
	int sum=0;
	for(int i=0;i<array.length;i++)
	{
	sum=sum+array[i];
	}
	return sum/n;
	}
}


