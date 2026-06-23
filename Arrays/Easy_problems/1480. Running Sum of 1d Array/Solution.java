/*
 Problem: Running Sum of 1d Array

 Given an array nums. We define a running sum of an array as
 runningSum[i] = sum(nums[0]…nums[i]).

 Return the running sum of nums.

 Example 1:
 Input: nums = [1,2,3,4]
 Output: [1,3,6,10]
 Explanation: Running sum is obtained as follows:
 [1, 1+2, 1+2+3, 1+2+3+4].

 Example 2:
 Input: nums = [1,1,1,1,1]
 Output: [1,2,3,4,5]
 Explanation: Running sum is obtained as follows:
 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

 Example 3:
 Input: nums = [3,1,2,10,1]
 Output: [3,4,6,16,17]

 Constraints:
 1 <= nums.length <= 1000
 -10^6 <= nums[i] <= 10^6
*/

// This file is intended to describe the solution approach entirely through comments.
// No executable code is written, as requested.
// The class below is a structural placeholder for where a Java implementation would go.

public class Solution {
    // Problem summary:
    // - The input is an integer array named nums.
    // - The output should be a new integer array of the same length.
    // - Each output element at index i should represent the sum of all
    //   input elements from index 0 through index i.

    // Running sum behavior:
    // If nums = [a, b, c, d], then the result should be:
    // [a, a+b, a+b+c, a+b+c+d].

    // Important details to keep in mind:
    // 1. The output array length matches the input array length.
    // 2. The first element of the output is the first element of the input.
    // 3. Each subsequent value is the previous running sum plus the current input value.
    // 4. The input values can be negative or positive.

    // Example walkthrough:
    // Input:  [3, 1, 2, 10, 1]
    // Step 0:  runningSum[0] = 3
    // Step 1:  runningSum[1] = 3 + 1 = 4
    // Step 2:  runningSum[2] = 4 + 2 = 6
    // Step 3:  runningSum[3] = 6 + 10 = 16
    // Step 4:  runningSum[4] = 16 + 1 = 17
    // Output: [3, 4, 6, 16, 17]

    // In a complete implementation, this class would include a method like:
    // public int[] runningSum(int[] nums) {
    //     // create result array of the same length as input
    //     // maintain a cumulative sum variable
    //     // iterate through nums, update cumulative sum, assign to result
    //     // return result array
    // }
}
class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=sum+nums[i];
            sum=nums[i];
        }
        return nums;
    }
}