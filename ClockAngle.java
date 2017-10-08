package com.encapsulation;

public class ClockAngle {
	float calculate_angle(int hour, int minute) {
		float hourHand;
		float minuteHand;
		float angle;

		hourHand = (float) ((hour * 30) + (minute * 0.5));
		minuteHand = minute * 6;
		
		if(hourHand > minuteHand) {
			angle = hourHand - minuteHand;
		}

		else {
			angle = minuteHand - hourHand;
		}

		if(angle > 180) {
			angle = 360 - angle;
		}

		return angle;
	}
	
	public static void main(String[] args) {
		ClockAngle c = new ClockAngle();
		System.out.println(c.calculate_angle(0, 2));
	}
}