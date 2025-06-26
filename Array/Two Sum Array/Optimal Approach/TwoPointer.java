public class TwoPointer {
    public int[] TwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                System.out.println("Elements found");
                return new int[] {left, right};
            }
            else if(sum > target) {
                right--;
            }
            else {
                left++;
            }
        }
        System.out.println("No such pair of elements found in array");
        return new int[] {};
    }
}
