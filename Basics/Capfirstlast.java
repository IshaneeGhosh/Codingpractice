import java.util.*;
class Capfirstlast{
public static void main(String args[]){
	System.out.println("Enter a sentence:");
	Scanner sc=new Scanner(System.in);
	String s;
	String arr[];
	s=sc.nextLine();
	arr=s.split(" ");
	for(String word:arr)
	{
		if(word.length()>2)	
			System.out.println(Character.toUpperCase(word.charAt(0))+""+word.substring(1,word.length()-1)+""+Character.toUpperCase(word.charAt(word.length()-1)));
		else
			System.out.println(word.toUpperCase());
	}

}
}
