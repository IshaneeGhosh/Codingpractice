import java.util.*;
class MajorityElement{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String line;
	line=sc.nextLine();
	Scanner abc=new Scanner(line);
	int arr[]=new int[100];
	int i=0;
	
	while(abc.hasNext())
	{
		arr[i]=abc.nextInt();
		i++;
	}
	
	HashMap<Integer,Integer> map=new HashMap<>();
	for(int j=0; j<i; j++)
	{
		if(map.containsKey(arr[j]))
			map.put(arr[j],(map.get(arr[j])+1));
		else
			map.putIfAbsent(arr[j],1);
	}

	for(Map.Entry<Integer,Integer>entry:map.entrySet())
	{
		if(entry.getValue()>i/2)
		{
			System.out.println("Majority element: \n "+entry.getKey()+":"+entry.getValue());
			System.exit(0);
		}
	}
	System.out.println("No majority element");
}
}
