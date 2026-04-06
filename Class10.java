import java.util.*;
class Class10{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);	
	Inventory arr[]=new Inventory[4];
	for(int i=0;i<4;i++)
	{
		String a=sc.next();
		int b=sc.nextInt(); sc.nextLine();
		int c=sc.nextInt(); sc.nextLine();
		int d=sc.nextInt(); sc.nextLine();
		arr[i]=new Inventory(a,b,c,d);
	}
	int limit=sc.nextInt(); sc.nextLine();
	printthresh(arr,limit);
	
}
public static void printthresh(Inventory arr[], int limit)
{
	for(Inventory x:arr)
	{
		int temp=x.getthreshold();
		if(temp<=limit)
		{
			if(temp>=75)
				System.out.println(x.getid()+" Critical Filling");
			else if(temp>=50)
				System.out.println(x.getid()+" Moderate Filling");
			else
				System.out.println(x.getid()+" Non-Critical Filling");
		}
	
	}
}
}
