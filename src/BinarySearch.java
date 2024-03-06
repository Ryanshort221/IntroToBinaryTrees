import java.util.Arrays;
public class BinarySearch {
    public static void search(int[] arr, int find) {
        Arrays.sort(arr);
        int count = 0;
        int low = 0;
        int high = arr.length - 1;
        // begin with interval covering whole array
        // if value of search key is less than item in middle of interval, narrow interval to lower half, otherwise narrow to upper half
        // repeatedly check until the value is found or the interval is empty
        while (low <= high) {
            count++;
            int mid = low + (high - low) / 2;
            if (arr[mid] == find) {
                System.out.println("Element found at index " + mid + ". Number of iterations: " + count);
                return;
            }
            if (arr[mid] < find) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}
