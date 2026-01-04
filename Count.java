import java.util.*;
class Count
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s;
	s=sc.nextLine();
	int vowel,cons,space;
	s=s.toUpperCase();
	vowel=cons=space=0;
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if((int)c==32)
			space++;
		else if((int)c>=65 && (int)c<=90)
		{
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				vowel++;
			else 
				cons++;
		}
	}
	System.out.println("Spaces:"+space);
	System.out.println("Vowels:"+vowel);
	System.out.println("Consonant:"+cons);
}
}
