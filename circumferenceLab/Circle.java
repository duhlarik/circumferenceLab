package circumferenceLab;

import java.text.DecimalFormat;

public class Circle {
	
	private double radius;
	private double circumference;
	private String formattedCircumference;
	private double area;
	private String formattedArea;
	
	DecimalFormat df = new DecimalFormat("#.00");
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	private double getCircumference() {
		return circumference = 2 * Math.PI * radius;
	}
	
	public String getFormattedCircumference() {
		return formattedCircumference = df.format(getCircumference());
	}
	
	private double getArea() {
		return area = Math.PI * radius * radius;
	}
	
	public String getFormattedArea() {
		return formattedArea = df.format(getArea()); 
	}
	
}
