package _03_More_Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
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

	public static String findLongestWord(List<String> words) {
		String total = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > total.length()) {
				total = words.get(i);
			}
		}
		return total;
	}

	public static Boolean containsSOS(List<String> message) {
		boolean total = false;
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).equals("... --- ...")) {
				return true;
			}
			else {
				total = false;
			}
		}
		return total;
	}

	public static List<Double> sortScores(List<Double> results) {
		Double[] arr = new Double[results.size()];
		
		for (int p = 0; p < results.size(); p ++) {
			arr[p] = results.get(p);
		}
		for (int o = 0; o < arr.length; o++) {
			for (int i = 0; i < arr.length; i++) {
				if (i + 1 <= arr.length - 1) {
					if (arr[i] > arr[i + 1]) {
						Double temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						
					}
				}
			}
		}
		List<Double> total =  Arrays.asList(arr);
		return total;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String[] arr = new String[unsortedSequences.size()];
		
		for (int p = 0; p < unsortedSequences.size(); p ++) {
			arr[p] = unsortedSequences.get(p);
		}
		for (int o = 0; o < arr.length; o++) {
			for (int i = 0; i < arr.length; i++) {
				if (i + 1 <= arr.length - 1) {
					if (arr[i].length() > arr[i + 1].length()) {
						String temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						
					}
				}
			}
		}
		List<String> total =  Arrays.asList(arr);
		return total;
	}

	public static List<String> sortWords(List<String> words) {
	String[] arr = new String[words.size()];
		
		for (int p = 0; p < words.size(); p ++) {
			arr[p] = words.get(p);
		}
		for (int o = 0; o < arr.length; o++) {
			for (int i = 0; i < arr.length; i++) {
				if (i + 1 <= arr.length - 1) {
					if (arr[i].compareTo(arr[i + 1]) > 0) {
						String temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						
					}
				}
			}
		}
		List<String> total =  Arrays.asList(arr);
		return total;
	}
}
