import java.util.*;
public class Class9
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Sim arr[]=new Sim[4];
	for(int i=0; i<4; i++)
	{
		int a=sc.nextInt(); sc.nextLine();
		String b=sc.nextLine();
		double c=sc.nextDouble(); sc.nextLine();
		double d=sc.nextDouble(); sc.nextLine();
		String e=sc.nextLine();
		arr[i]=new Sim(a,b,c,d,e);
	}
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	Sim ans[]=transferCustomerCircle(arr,s1,s2);
	if(ans==null)
		System.out.println("Nope");
	else
	{
		for(Sim x:ans)
		{
			System.out.println(x.getid()+" "+x.getname()+" "+x.getcircle()+" "+x.getrate());
		}
	}
}
public static Sim[] transferCustomerCircle(Sim arr[], String s1, String s2)
{
	int count=0;
	for(Sim x:arr)
	{
		if(x.getcircle().equalsIgnoreCase(s1))
			count++;
	}
	if(count==0)
		return null;
	int j=0;
	Sim ans[]=new Sim[count];
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i].getcircle().equalsIgnoreCase(s1))
		{
			arr[i].setcircle(s2);
			ans[j++]=arr[i];
		}
	}
	
	for(int a=0; a<j; a++)
	{
		for(int b=a+1; b<j; b++)
		{
			if(ans[a].getrate()<ans[b].getrate())
			{
				Sim temp=ans[a];
				ans[a]=ans[b];
				ans[b]=temp;
			}
		}
	}
	return ans;	
}
}
