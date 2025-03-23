public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped; 
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Stop if already sorted
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 115, 12, 22,12, 11};
        bubbleSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
