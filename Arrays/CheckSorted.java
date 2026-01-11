import java.util.*;
class CheckSorted{
public static boolean Sorted(int arr[])
{
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i+1]<arr[i])
			return false;
	}
	return true;
}
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
	if(Sorted(arr))
		System.out.println("Sorted");	
	else	
		System.out.println("Not Sorted");
}
}
