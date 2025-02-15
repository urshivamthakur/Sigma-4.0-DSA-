public class LastOccurance {
    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 4, 5, 6, 7, 8, 5 };
        int key = 5;
        int i = 0;
        int FirstOccurance = lastOccurance(arr, key, i);
        System.out.println(FirstOccurance);
    }
}
