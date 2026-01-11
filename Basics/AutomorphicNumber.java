import java.util.*;
class AutomorphicNumber
{
public static void main(String args[])
{
	int n;
	System.out.println("Enter a number:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int m=n;
	int count=0;
	while(m>0)
	{
		m=m/10;
		count++;
	}
	if((n*n)%((int)Math.pow(10.0,(double)count))==n)
		System.out.println("Automorphic");
	else
		System.out.println("Not Automorphic");
}
}
