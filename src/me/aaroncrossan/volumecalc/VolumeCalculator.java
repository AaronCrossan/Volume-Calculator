package me.aaroncrossan.volumecalc;

public class VolumeCalculator {
	
	// conversion methods
	public static double convertFt(double size) {
		return size * 3.281d;
	}
	
	public static void main(String[] args) {
		System.out.println("Volume Calculator 1.0");
		
		// declare unit
		String unit = "metres cubed";
		
		// initialise lengths
		double length = 0;
		double width = 0;
		double height = 0;
		
		try {
			length = Double.parseDouble(System.console().readLine("enter length : "));
			width = Double.parseDouble(System.console().readLine("enter width : "));
			height = Double.parseDouble(System.console().readLine("enter height : "));
			
		} catch (Exception e) {
			System.out.println("Inputs must be a number.");
		}
		
		
		// check all sizes are valid
		if (length > 0 && width > 0 && height > 0) {
			// calculate volume (metres^3)
			double volume = (width * length) * height; 
			// print metres^3
			System.out.println("your total volume is " + (volume > 0 ? volume : "") + " " + unit + " and");
			// print cubed ft
			System.out.println("your total voume is " + (volume > 0 ? convertFt(volume) : "") + " ft cubed.");
		} else {
			System.out.println("width, length and height must all be greater than 0.");
		}
	}
}
