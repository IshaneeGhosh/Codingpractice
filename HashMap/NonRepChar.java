//Instead of iterating over the HashMap entries, you should iterate over the string itself and check the frequency of each character as you go. This will ensure you get the first non-repeating character.
import java.util.*;
class NonRepChar
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s;
	s=sc.next();
	s=s.toLowerCase();
	HashMap<Character,Integer> map=new HashMap<>();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(map.containsKey(c))
			map.put(c,map.get(c)+1);
		else
			map.put(c,1);
	}
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(map.get(c)==1)
		{
			System.out.println("First non repeating character:"+c);
			System.exit(0);
		}
	}
}
}
