package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int total = 0;
    	total = num1*num2;
    	
    	String totalS = num1 + " x " + num2 + " = " + total;
    	
        return totalS;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	int total = -1;
		for (int i = 0 ; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				total = i;
				return total;
			}
		}
        return -1;
    }

	public static boolean isPrime(int num) {
		if (num<= 1) {
		return false;
		}
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSquare(int num) {
		double sqrt = Math.sqrt(num);
		
		return sqrt%1 == 0;
	}

	public static boolean isCube(int num) {
		double sqrt = Math.cbrt(num);
		
		return sqrt%1 == 0;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int total = 0;
		for (int i = 0 ; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true)) {
				total++;
			}
		}
		return total;
	}

	public static double findTallest(List<Double> peeps) {
		double total = 0;
		for (int i = 0 ; i < peeps.size(); i++) {
			if (peeps.get(i) > total) {
				total = peeps.get(i);
			}
		}
		return total;
	}
}
