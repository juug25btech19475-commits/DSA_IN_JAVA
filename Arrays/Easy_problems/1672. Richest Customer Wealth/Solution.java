/*
 * Problem: Richest Customer Wealth
 *
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount
 * of money the i-th customer has in the j-th bank. Return the wealth that the
 * richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts.
 * The richest customer is the customer that has the maximum wealth.
 *
 * Example 1:
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 *   1st customer has wealth = 1 + 2 + 3 = 6
 *   2nd customer has wealth = 3 + 2 + 1 = 6
 *   Both customers are considered the richest with a wealth of 6 each,
 *   so return 6.
 *
 * Example 2:
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation:
 *   1st customer has wealth = 6
 *   2nd customer has wealth = 10
 *   3rd customer has wealth = 8
 *   The 2nd customer is the richest with a wealth of 10.
 *
 * Example 3:
 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
 * Output: 17
 *
 * Constraints:
 *   m == accounts.length
 *   n == accounts[i].length
 *   1 <= m, n <= 50
 *   1 <= accounts[i][j] <= 100
 *
 * Commentary:
 *   - The goal is to evaluate every customer's total wealth and determine the
 *     highest value among them.
 *   - For each customer (each row in the accounts matrix), compute the sum of
 *     their bank balances.
 *   - Track the maximum sum found while iterating through the customers.
 *   - The result is the wealth of the richest customer.
 *
 * Suggested implementation approach (commented, not executed):
 *
 *   1. Initialize an integer variable named maxWealth to 0.
 *   2. Loop through each customer row in accounts.
 *      a. Initialize currentWealth to 0 for the current customer.
 *      b. Loop through each bank balance in that customer row.
 *      c. Add each balance to currentWealth.
 *      d. After summing this customer's balances, compare currentWealth with
 *         maxWealth and update maxWealth if currentWealth is larger.
 *   3. After processing all customers, return maxWealth.
 *
 * Example pseudocode:
 *
 *   int maximumWealth(int[][] accounts) {
 *       int maxWealth = 0;
 *       for (int i = 0; i < accounts.length; i++) {
 *           int currentWealth = 0;
 *           for (int j = 0; j < accounts[i].length; j++) {
 *               currentWealth += accounts[i][j];
 *           }
 *           if (currentWealth > maxWealth) {
 *               maxWealth = currentWealth;
 *           }
 *       }
 *       return maxWealth;
 *   }
 *
 * Notes:
 *   - This problem is straightforward and uses simple iteration over a 2D array.
 *   - The time complexity is O(m * n), where m is the number of customers and n is
 *     the number of banks per customer.
 *   - The space complexity is O(1) beyond the input data, because only a few
 *     integer variables are needed.
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        
        int maximum=0;
        for(int i=0;i<accounts.length;i++){
            int wealth=0;
            for(int j=0;j<accounts[i].length;j++){
                wealth=wealth+accounts[i][j];
                
            }
           if(wealth>maximum){
            maximum=wealth;
           }
        }
        return maximum;
    }
}