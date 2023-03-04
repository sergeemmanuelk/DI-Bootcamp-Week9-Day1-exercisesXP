import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        int n = arr.length;

        // Step 1: Sort the array in non-descending order
        Arrays.sort(arr);

        // Step 2: Create a new array of the same size as the input array
        int[] result = new int[n];

        // Step 3: Traverse the sorted array and fill in the even positions of the new array with the largest remaining elements
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j < n) {
            result[j] = arr[i];
            i -= 2;
            j += 2;
        }

        // Step 4: Traverse the sorted array again and fill in the odd positions of the new array with the remaining elements
        i = n - 2;
        j = 1;
        while (i >= 0 && j < n) {
            result[j] = arr[i];
            i -= 2;
            j += 2;
        }

        // Print the result
        for (int k = 0; k < n; k++) {
            System.out.print(result[k] + " ");
        }
    }
}