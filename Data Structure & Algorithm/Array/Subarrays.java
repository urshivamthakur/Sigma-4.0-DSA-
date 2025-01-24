public class Subarrays {
    public static void printSubarrays(int arr[]) {
        int totalSum = 0; // Variable to store the sum of all subarrays
        int ts = 0; // Variable to count the total number of subarrays

        for (int i = 0; i <= arr.length - 1; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                // Calculate the sum of the current subarray
                int subarraySum = 0;
                for (int k = start; k <= end; k++) { // print
                    subarraySum += arr[k];
                    System.out.print(arr[k] + " "); // subarrays
                }
                // Add the subarray sum to the total sum
                totalSum += subarraySum;

                // Increment total subarray count
                ts++;

                System.out.println("=> Subarray sum: " + subarraySum);
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays: " + ts);
        System.out.println("Sum of all subarrays " + totalSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubarrays(arr);
    }
}