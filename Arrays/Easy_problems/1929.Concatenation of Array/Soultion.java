/*
 * Problem: Concatenation of Array
 *
 * Given an integer array nums of length n, create a new array ans of length 2n.
 * The new array should contain nums followed by nums again.
 *
 * In other words:
 *   - ans[i] == nums[i] for 0 <= i < n
 *   - ans[i + n] == nums[i] for 0 <= i < n
 *
 * This means ans is simply the concatenation of nums with itself.
 *
 * Example 1:
 *   Input:  nums = [1, 2, 1]
 *   Output: [1, 2, 1, 1, 2, 1]
 *   Explanation: ans = [nums[0], nums[1], nums[2], nums[0], nums[1], nums[2]]
 *
 * Example 2:
 *   Input:  nums = [1, 3, 2, 1]
 *   Output: [1, 3, 2, 1, 1, 3, 2, 1]
 *   Explanation: ans = [nums[0], nums[1], nums[2], nums[3], nums[0], nums[1], nums[2], nums[3]]
 *
 * Constraints:
 *   - n == nums.length
 *   - 1 <= n <= 1000
 *   - 1 <= nums[i] <= 1000
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n+n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}