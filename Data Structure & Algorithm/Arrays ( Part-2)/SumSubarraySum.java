public class SumSubarraySum {
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) { // print
                    currSum += arr[k];
                    // System.out.print(arr[k] + " "); //NO NEED TO PRINT SUB ARRAY ACCORDING TO
                    // QUESTION

                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubarraySum(arr);
    }
}
