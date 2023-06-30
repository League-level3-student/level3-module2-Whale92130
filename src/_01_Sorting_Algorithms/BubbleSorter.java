package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	for (int o = 0; o < array.length; o++) {
			for (int i = 0; i < array.length; i++) {
				if (i + 1 <= array.length - 1) {
					if (array[i] > array[i + 1]) {
						int temp = array[i];
						array[i] = array[i + 1];
						array[i + 1] = temp;
						display.updateDisplay();
					}
				}
			}
		}
    }
}
