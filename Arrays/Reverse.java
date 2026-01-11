import java.util.*;
class Reverse{
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
	int l=0,r=len-1;
	System.out.println("Array:\n"+Arrays.toString(arr));
	while(l<r)
	{
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
		l++;
		r--;
	}			
	System.out.println("Reversed Array:\n"+Arrays.toString(arr));
}
}
