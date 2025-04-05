package bonusAssignment;

public class CountryInfo {

	private String name;
	private long population;
	private double christianPercentage, evangelicalPercentage;

	public CountryInfo(String name, long population, double christianPercentage, double evangelicalPercentage) {
		this.name = name;
		this.population = population;
		this.christianPercentage = christianPercentage;
		this.evangelicalPercentage = evangelicalPercentage;
	}

	public String getName() {
		return name;
	}

	public long getPopulation() {
		return population;
	}

	public double getChristianPercentage() {
		return christianPercentage;
	}

	public double getEvangelicalPercentage() {
		return evangelicalPercentage;
	}

}
