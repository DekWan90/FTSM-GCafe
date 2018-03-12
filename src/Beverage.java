
public class Beverage {

private String origin;
private String brand; 
private String name;
private boolean veganFriendly;
private double pricePerPack; 
private int quantityPerPack;
private String nutritionInfo;

public Beverage(String o,String b, String n,boolean v,double p, int q, String nu)
{
	this.origin = o;
	brand = b;
	name = n;
	veganFriendly = v;
	pricePerPack = p;
	quantityPerPack = q;
	nutritionInfo = nu;
}
}
