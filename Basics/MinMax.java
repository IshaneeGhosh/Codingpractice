import java.util.*;
class MinMax
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int max=0;
	int min=Integer.MAX_VALUE;
	int p,q;
	p=q=n;
	while(p>0)
	{
		int dig=p%10;
		if(dig>max)
			max=dig;
		p=p/10;
	}
	System.out.println("Max:"+max);
	while(q>0)
	{
		int dig=q%10;
		if(dig<min)
			min=dig;
		q=q/10;
	}
	System.out.println("Min:"+min);
}
}
