public class LinearSearch {
    int[] arr;
    int x;

    public LinearSearch(int[] arr, int x) {
        this.arr = arr;
        this.x = x;
    }

    public static void search(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index " + i + ". Number of iterations: " + count);
            }
            count++;
        }
    }
}
