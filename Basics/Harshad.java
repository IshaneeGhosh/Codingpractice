import java.util.*;
class Harshad{
public static void main(String args[])
{
	System.out.println("Enter a Number:");
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int m=n, sum=0;
	while(m>0)
	{
		sum+=(m%10);
		m/=10;
	}
	if(n%sum==0)
		System.out.println("Harshad Number");
	else 
		System.out.println("Not Harshad Number");

}
}
