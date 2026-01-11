import java.util.*;
class Largest
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length:");
	int len;
	len=sc.nextInt();
	int arr[]=new int[len];
	System.out.println("Enter array elements.");
	for(int i=0;i<len;i++)
		arr[i]=sc.nextInt();
	
	int largest=arr[0];
	int sl=Integer.MIN_VALUE;
	for(int x:arr)
	{
		if(x>largest)
		{
			sl=largest;
			largest=x;
		}
		else if(x<largest && x>sl)
		{
			sl=x;
		}
	}
	System.out.println("Largest:"+largest);
	System.out.println("Second Largest:"+sl);	
}
}
