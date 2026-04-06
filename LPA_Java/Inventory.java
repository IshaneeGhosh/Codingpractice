import java.util.*;
class Inventory
{
	String id;
	int maxq, curq, threshold;
	Inventory(String id, int maxq, int curq, int threshold)
	{
		this.id=id;
		this.maxq=maxq;
		this.curq=curq;
		this.threshold=threshold;
	}
	
	public String getid(){return id;}
	public int getmaxq(){return maxq;}
	public int getcurq(){return curq;}
	public int getthreshold(){return threshold;}
}
