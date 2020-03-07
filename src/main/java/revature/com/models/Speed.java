package revature.com.models;

import java.time.Duration;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Speed {
	private Duration duration;
	@Embedded
	private Distance distance;
	
	public Speed() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Speed(Duration duration, Distance distance) {
		super();
		this.duration = duration;
		this.distance = distance;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public Distance getDistance() {
		return distance;
	}

	public void setDistance(Distance distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Speed [duration=" + duration + ", distance=" + distance + "]";
	}
	
	
	
}

