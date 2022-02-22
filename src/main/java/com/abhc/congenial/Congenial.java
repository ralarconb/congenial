package com.abhc.congenial;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		if (n == 1)
			return n;
		int result = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == (n / i))
					result += i;
				else
					result += (i + n / i);
			}
		}
		return result + 1 + n;
	}
}

public class Congenial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}

}
