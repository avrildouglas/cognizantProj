package revature.com.models;

public class Distance {

	
	private DistanceUnit distanceUnit;
	private Double unit;
	public Distance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Distance(DistanceUnit distanceUnit, Double unit) {
		super();
		this.distanceUnit = distanceUnit;
		this.unit = unit;
	}
	public DistanceUnit getDistanceUnit() {
		return distanceUnit;
	}
	public void setDistanceUnit(DistanceUnit distanceUnit) {
		this.distanceUnit = distanceUnit;
	}
	public Double getUnit() {
		return unit;
	}
	public void setUnit(Double unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "Distance [distanceUnit=" + distanceUnit + ", unit=" + unit + "]";
	}
	
	
	
	
}
