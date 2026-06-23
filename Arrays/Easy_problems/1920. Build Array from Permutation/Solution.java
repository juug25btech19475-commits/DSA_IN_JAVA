/*
 * ============================================================================
 * LeetCode Problem 1920: Build Array from Permutation
 * ============================================================================
 * 
 * PROBLEM STATEMENT:
 * Given a zero-based permutation nums (0-indexed), build an array ans of the
 * same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length
 * and return it.
 * 
 * A zero-based permutation nums is an array of distinct integers from 0 to
 * nums.length - 1 (inclusive).
 * 
 * ============================================================================
 * EXAMPLES:
 * ============================================================================
 * 
 * Example 1:
 *   Input:  nums = [0,2,1,5,3,4]
 *   Output: [0,1,2,4,5,3]
 *   
 *   Explanation:
 *   ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], 
 *          nums[nums[3]], nums[nums[4]], nums[nums[5]]]
 *       = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
 *       = [0, 1, 2, 4, 5, 3]
 * 
 * Example 2:
 *   Input:  nums = [5,0,1,2,3,4]
 *   Output: [4,5,0,1,2,3]
 *   
 *   Explanation:
 *   ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], 
 *          nums[nums[3]], nums[nums[4]], nums[nums[5]]]
 *       = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
 *       = [4, 5, 0, 1, 2, 3]
 * 
 * ============================================================================
 * CONSTRAINTS:
 * ============================================================================
 * • 1 <= nums.length <= 1000
 * • 0 <= nums[i] < nums.length
 * • The elements in nums are distinct.
 * 
 * ============================================================================
 * SOLUTION APPROACH:
 * ============================================================================
 * 
 * Time Complexity:  O(n) - Single pass through the array
 * Space Complexity: O(n) - For the result array (excluding output space)
 * 
 * Algorithm:
 * 1. Create a result array 'ans' of the same length as 'nums'
 * 2. Iterate through each index i from 0 to nums.length - 1
 * 3. For each index i, set ans[i] = nums[nums[i]]
 * 4. Return the result array
 * 

