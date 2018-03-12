import java.util.*;
public class Cafe {
	
	private String name;
	private String address;
	private int noOfBarista;
	private ArrayList<Beverage> beverageList=new ArrayList<Beverage>();
	
	public Cafe (String name, String address, int noOfBarista) {
		this.name =name;
		this.address=address;
		this.noOfBarista =noOfBarista;
		
	}
    
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getNoOfBarista() {
		return noOfBarista;
	}
	
	
}
