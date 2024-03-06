public class LinearSerach {
    int[] arr;
    int x;

    public LinearSerach(int[] arr, int x) {
        this.arr = arr;
        this.x = x;
    }

    public int search() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
