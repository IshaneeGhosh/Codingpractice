import java.util.*;
class LRotatebyI{
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
	System.out.println("Array:\n"+Arrays.toString(arr));	
	int l=arr[0];
	for(int i=0;i<len-1;i++)
	{
		arr[i]=arr[i+1];
	}		
	arr[len-1]=l;	
	System.out.println("Rotated Array:\n"+Arrays.toString(arr));
}
}
