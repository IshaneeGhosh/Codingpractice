import java.util.*;
public class Sim
{
double bal, rate;
int id;
String name,circle;

public Sim(int id,String name, double bal, double rate, String circle)
{
	this.id=id;
	this.name=name;
	this.bal=bal;
	this.rate=rate;
	this.circle=circle;
}
public int getid(){return id;}
public String getname(){return name;}
public String getcircle(){return circle;}

public void setcircle(String circle)
{
this.circle=circle;
}

public double getrate(){return rate;}
public double getbal(){return bal;}
}
