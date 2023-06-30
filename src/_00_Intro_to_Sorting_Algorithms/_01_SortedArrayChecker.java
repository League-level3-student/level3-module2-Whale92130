package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
	/*
	 * Write a static method called intArraySorted.
	 *
	 * This method takes in an array of integers and it returns a boolean. The
	 * method returns true if the integer array is in ascending order and false
	 * otherwise.
	 */
	public static boolean intArraySorted(int[] arr) {

		boolean total = false;
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 <= arr.length-1) {
				if (arr[i] < arr[i + 1]) {
					total = true;
				} else {
					total = false;

				}
			}
		}
		return total;

	}

	/*
	 * 2. Write a static method called doubleArraySorted.
	 *
	 * This method takes in an array of doubles and it returns a boolean. The method
	 * returns true if the double array is in ascending order and false otherwise.
	 */
	public static boolean doubleArraySorted(double[] arr) {

		boolean total = false;
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 <= arr.length-1) {
				if (arr[i] < arr[i + 1]) {
					total = true;
				} else {
					total = false;

				}
			}
		}
		return total;

	}
	/*
	 * 3. Write a static method called charArraySorted.
	 * 
	 * This method takes in an array of characters and it returns a boolean. The
	 * method returns true if the character array is in alphabetical order and false
	 * otherwise (You can compare characters just like integers).
	 */

	public static boolean charArraySorted(char[] arr) {
		boolean total = false;;
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 <= arr.length-1) {
				if (arr[i] < arr[i + 1]) {
					total = true;
				} else {
					total = false;

				}
			}
		}
		return total;

	}
	/*
	 * 4. Write a static method called stringArraySorted.
	 *
	 * This method takes in an array of Strings and it returns a boolean. The method
	 * returns true if the String array is in alphabetical order and false otherwise
	 * (Use the compareTo(String) method).
	 */
	public static boolean stringArraySorted(String[] arr) {
		boolean total = false;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 <= arr.length-1) {
				if (arr[i].compareTo(arr[i+1]) < 0) {
					count++;
				} else {
					

				}
			}
		}
		if (count == arr.length-1) {
			total = true;
		}
		else {
			total = false;
		}
		return total;

	}
}
