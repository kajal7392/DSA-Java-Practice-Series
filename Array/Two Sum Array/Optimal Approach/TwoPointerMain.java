public class TwoPointerMain {
    public static void main(String[] args) {
        TwoPointer tp = new TwoPointer();

        int[] arr1 = {2, 3, 4, 7, 11};
        int target1 = 10;
        printResult(arr1, target1, tp);

        int[] arr2 = {1, 2, 4, 6, 10};
        int target2 = 12;
        printResult(arr2, target2, tp);

        int[] arr3 = {1, 3, 5, 7, 9};
        int target3 = 20;
        printResult(arr3, target3, tp);
    }

    public static void printResult(int[] nums, int target, TwoPointer tp) {
        int[] result = tp.TwoSum(nums, target);
        System.out.print("Input: ");
        printArray(nums);
        System.out.println("Target: " + target);

        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Output: No valid pair found.");
        }

        System.out.println("--------------------------");
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] ");
    }
}
