package intro.java;

public class CheckPrimeNumbers {
	public static void isNumberPrime(int number) {

		if (number == 1) {
			System.out.println("Not Prime= " + number);
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.println("Prime= " + i);
			}else {
				System.out.println("Not Prime= " + i);
			}
		}
		//System.out.println("Prime= " + number);

	}
}
