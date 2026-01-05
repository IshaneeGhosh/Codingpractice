import java.util.*;
class BoyreMoore{
public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	String line;
	line=sc.nextLine();
	String arr[]=line.split(" ");
	HashMap<Integer,Integer> map=new HashMap<>();
	for(String s:arr)
	{
		int i=Integer.parseInt(s);
		if(map.containsKey(i))
			map.put(i,map.get(i)+1);
		else
			map.putIfAbsent(i,1);
	}
	for(Map.Entry<Integer,Integer> entry:map.entrySet())
	{
		if(entry.getValue()>arr.length/3)
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	

}
}
