import java.util.*;
class Anagram
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1,s2;
	System.out.println("Enter string1:");
	s1=sc.next();
	System.out.println("Enter string2:");
	s2=sc.next();
	boolean flag=true;
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	
	if(s1.length()!=s2.length())
		flag=false;
	else	
	{
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(map.containsKey(c))
				map.put(c,map.get(c)+1);
			else
				map.put(c,1);
		}
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			if(map.containsKey(c))
				map.put(c,map.get(c)-1);
			else{
				flag=false;
				break;
			}
		}
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(map.get(c)!=0)
				flag=false;
		}
	}
	if(flag)
		System.out.println("Anagram");	
	else
	 	System.out.println("Not Anagram");
}
}
