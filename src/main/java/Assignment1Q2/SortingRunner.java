package Assignment1Q2;

public class SortingRunner {
    public static void main(String[] args) {
        int[] arr =  {1,2,3};
        int n = 3;
        SortingAlgorithm mySelectionSort = new SelectionSort();
        mySelectionSort.sort(arr, n);
        for(int a: arr) System.out.print(a + " ");
        System.out.println();

        SortingAlgorithm myInsertionSort = new InsertionSort();
        myInsertionSort.sort(arr, n);
        for(int a: arr) System.out.print(a + " ");
        System.out.println();

        SortingAlgorithm myBubbleSort = new BubbleSort();
        myBubbleSort.sort(arr, n);
        for(int a: arr) System.out.print(a + " ");
        System.out.println();
    }
}
