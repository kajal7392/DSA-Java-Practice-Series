public class BruteForceMain {
    //Main Method
    public static void main(String[] args) {
        BruteForce bruteForce = new BruteForce();
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        printResult(arr1, target1, bruteForce);

        int[] arr2 = {1, 2, 3, 4, 5};
        int target2 = 10;
        printResult(arr2, target2, bruteForce);

        int[] arr3 = {0, 5, -2, 8};
        int target3 = 6;
        printResult(arr3, target3, bruteForce);
    }

    // Utility method to print output clearly
    public static void printResult(int[] arr, int target, BruteForce bruteForce) {
        int[] result = bruteForce.TwoSum(arr, target);
        System.out.print("Input: ");
        printArray(arr);
        System.out.println("Target: " + target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        System.out.println("--------------------------");
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.print("] ");
    }
}
