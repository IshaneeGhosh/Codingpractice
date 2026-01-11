import java.util.*;
class PrimeFactors{
public static void main(String args[])
{
	System.out.println("Enter a number:");
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	for(int i=2; i<n/2; i++)
	{
		if(isprime(i)==true && n%i==0)
			System.out.println(i);
	
	}
}
}
