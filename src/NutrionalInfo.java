
public class NutrionalInfo {
	
	
	private double energy;
	private double fat;
	private double carbohydrate;
	private double fibre;
	private double protein;
	private double sodium;
	
	public NutrionalInfo(double e,double f,double c, double fi, double p, double s)
	{
		energy = e;
		fat = f;
		carbohydrate = c;
		fibre= fi;
		protein = p;
		sodium = s;
	}

	public double getEnergy() {
		return energy;
	}

	public double getFat() {
		return fat;
	}

	public double getCarbohydrate() {
		return carbohydrate;
	}

	public double getFibre() {
		return fibre;
	}

	public double getProtein() {
		return protein;
	}

	public double getSodium() {
		return sodium;
	}
	
	

}
