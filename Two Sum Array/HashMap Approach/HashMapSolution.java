import java.util.HashMap;

public class HashMapSolution {
    //Logic implementation
     public int[] TwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length; i++) {
            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                System.out.println("Elements found");
                return new int[] {
                    map.get(complement),i
                };
            }
        map.put(nums[i], i);
        }
        System.out.println("Pair Elements not found");
        return new int[] {-1,-1};
     }
}
