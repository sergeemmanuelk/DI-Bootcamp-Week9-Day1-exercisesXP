import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesToEnd(int[] arr) {
        int count = 0; // Count of non-zero elements

        // Traverse the array from left to right
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // If current element is non-zero, move it to the front
                arr[count] = arr[i];
                count++;
            }
        }

        // Make all elements zero from 'count' till end of the array
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }
    }
}