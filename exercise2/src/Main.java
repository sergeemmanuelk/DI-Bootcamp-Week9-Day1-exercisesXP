import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};

        int secondLargest = findSecondLargest(arr);

        if (secondLargest != -1) {
            System.out.println("The second largest element is " + secondLargest + ".");
        } else {
            System.out.println("The second largest element does not exist.");
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            // If array has less than 2 elements, second largest doesn't exist
            return -1;
        }

        Arrays.sort(arr);

        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }

        // If all elements in the array are same, second largest doesn't exist
        return -1;
    }
}