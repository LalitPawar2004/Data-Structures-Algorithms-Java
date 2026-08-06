// Question: Sort an array using the Selection Sort algorithm.
package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current element is the smallest
            int minIndex = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only once per pass
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}