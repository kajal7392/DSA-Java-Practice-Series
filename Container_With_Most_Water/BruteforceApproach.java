/* Problem:
You are given an integer array height of length n. There are n vertical lines drawn such that the two 
endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the x-axis
form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, 
the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 
Constraints:
n == height.length
2 <= n <= 105
0 <= height[i] <= 104 
*/


// Solution:
public class BruteforceApproach {
    public int maxArea(int[] height) {
        int maxWater = 0;  // Set max water to 0
        int n = height.length;  // Get the length of height array

        //Iterate through each pair of lines
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int width = j-i;  //distance between two lines
                int currentHeight = Math.min(height[i], height[j]);
                int area = (currentHeight * width);  //Calculate the area

                maxWater = Math.max(maxWater, area);
            }
        }
        return maxWater;  // Return the maximum water that can be contained in the container
    }

    public static void main(String[] args) {
        BruteforceApproach object = new BruteforceApproach();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};  //Example Input
        int result = object.maxArea(height);
        System.out.println("The maximum water that can be contained is: "+ result);
    }
}