import java.util.*;
public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Cafe> cafeList = new ArrayList<Cafe>();
		
		Cafe c1 = new Cafe("FTSM Garden Cafe", "G1 BlockG, FTSM", 2);
		Cafe c2 = new Cafe("Zaaba Cafe", "G1 Admin Block, Kolej Zaaba", 6);
		Cafe c3 = new Cafe("Zar bakery & cefe", "L1 Pusanika", 3);
		
		cafeList.add(c1);
		cafeList.add(c2);
		cafeList.add(c2);
		System.out.println("Total number of cafe surveyed :"+ cafeList.size());

	}

}
