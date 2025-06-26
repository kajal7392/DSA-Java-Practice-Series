public class BruteForce {

    //Logic Implementation
    public int[] TwoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]+nums[j]==target) {
                    System.out.println("Pair found");
                    return new int[] {i,j};
                }
            }
        }
        System.out.println("Such pair not found in array");
        return new int[] {-1,-1};
    }
}