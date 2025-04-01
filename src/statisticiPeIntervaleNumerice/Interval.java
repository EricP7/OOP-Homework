package statisticiPeIntervaleNumerice;

public class Interval {
	
	private double min;
	private double max;
	private int nrTestate;
	private int nrContinute;
	
	public Interval(Double min, Double max) {
		this.min = min;
		this.max = max;

	}

	public String toString() {
		return "[" + this.min + "," + this.max + "]";
	}

}
