package module1assm1;

public class ConversionTable {

	    /** Convert from feet to meters */
	    public static double footToMeter(double foot) {
	        return 0.305 * foot;
	    }

	    /** Convert from meters to feet */
	    public static double meterToFoot(double meter) {
	        return 3.279 * meter;
	    }

	    public static void main(String[] args) {
	        System.out.println("Conversion Table");
	        System.out.println("Feet\t\tMeters\t\tMeters\t\tFeet");

	        for (double i = 1; i <= 10; i++) {
	            System.out.printf("%.1f\t\t%.3f\t\t%.1f\t\t%.3f\n", 
	                              i, footToMeter(i), 
	                              i, meterToFoot(i));
	        }
	    }
	}