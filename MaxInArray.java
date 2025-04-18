public class MaxInArray {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 3};
        System.out.println(findMax(arr));  
    }
}
