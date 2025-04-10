public class Qs_1 {
    public static void allOccurance(int arr[], int key, int i) {
        // Base case
        if (i == arr.length) {
            return;
        }

        // check
        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        // recursive call
        allOccurance(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 5, 8, 2, 8, 3, 5 };
        int key = 8;
        int i = 0;
        allOccurance(arr, key, i);
    }
}