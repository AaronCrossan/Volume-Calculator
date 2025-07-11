package me.aaroncrossan.volumecalc;

public class VolumeCalculator {
	
	// conversion methods
	public static double convertFt(double size) {
		return size * 3.281d;
	}
	
	public static void main(String[] args) {
		// declare unit
		String unit = "metres cubed";

		
		// initialise lengths
		double length = 1.00d;
		double width = 3.00d;
		double height = 5.00d;
		
		// check all sizes are valid
		if (length > 0 && width > 0 && height > 0) {
			// calculate volume (metres^3)
			double volume = (width * length) * height; 
			// print metres^3
			System.out.println("your total volume is " + (volume > 0 ? volume : "") + " " + unit + " and");
			// print cubed ft
			System.out.println("your total voume is " + (volume > 0 ? convertFt(volume) : "") + " cubed ft.");
		}
	}
}
