import java.util.*;
class SumAvg{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int len;
	System.out.println("Enter the length:");
	len=sc.nextInt();
	int arr[]=new int[len];
	System.out.println("Enter the array elements:");
	for(int i=0;i<len;i++)
		arr[i]=sc.nextInt();
	int sum=0;
	for(int x:arr)
		sum+=x;		
	System.out.println("Sum:"+sum);
	System.out.println("Average:"+(double)sum/len);
}
}
