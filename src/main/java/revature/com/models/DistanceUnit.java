package revature.com.models;

public enum DistanceUnit {
	

		Millimeters("millimeters"),
		Centimeters("centimeters"),
		Meters("meters"),
		Kilometers("kilometers"),
		Inches("inches"),
		Feet("feet"),
		Yards("yards"),
		Miles("miles");
	
	private String distance;
	
	private DistanceUnit (String distance) {
		this.distance = distance;
		
	}


}
