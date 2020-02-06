package intro.java;

public class MinutesToYearDaysCalculator {

	public static void PrintYearAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {

			long years = minutes / (60 * 24 * 365);
			long remaingDays = (minutes/(60*24)) % 365;
			System.out.println(minutes + " min = " + years + " y and "+remaingDays+" d");
			
		}
	}

}
