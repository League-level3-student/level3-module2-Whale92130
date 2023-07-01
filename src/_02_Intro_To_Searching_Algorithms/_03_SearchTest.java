package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
    	String[] words = {"apple", "banana", "car", "plane", "orange", "red"};
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(-1, _01_LinearSearch.linearSearch(words, "train"));
        assertEquals(0, _01_LinearSearch.linearSearch(words, "apple"));
        assertEquals(2, _01_LinearSearch.linearSearch(words, "car"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(false, true);
    }
}
