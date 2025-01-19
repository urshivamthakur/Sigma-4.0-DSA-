public class DecToBin {
    public static void decToBin(int decNum) {
        while (decNum > 0) {
            int myNum = decNum;
            int pow = 0;
            int binNum = 0;

            while (decNum > 0) {
                int rem = decNum % 2;
                binNum = binNum + (rem * (int) Math.pow(10, pow));
                pow++;
                decNum /= 2;
            }
            System.out.println("Binary for of " + myNum + " = " + binNum);
        }
    }

    public static void main(String[] args) {
        decToBin(12);
    }
}