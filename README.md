### Leetcode Questions:
## [73. Set Matrix Zero](https://leetcode.com/problems/set-matrix-zeroes/description/)
Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.

    class Solution {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[] rowIndex = new int[m];
            int[] colIndex = new int[n];
    
            // fill arrays with zeroes
            Arrays.fill(rowIndex, 0);
            Arrays.fill(colIndex, 0);
    
            // for all cells having zero set resp. rowIndex and colIndex as -1
            for(int row = 0; row < m; row++){
                for(int col = 0; col < n; col++){
                    if(matrix[row][col] == 0){
                        rowIndex[row] = -1;
                        colIndex[col] = -1;
                    }
                }
            }
    
            // for all rowIndex and colIndex as -1; convert the rows, cols to zero.
            for(int row = 0; row < m; row++){
                for(int col = 0; col < n; col++){
                    if(rowIndex[row] == -1 || colIndex[col] == -1){
                        matrix[row][col] = 0;
                    } 
                }
            }
        }
    }
### Brute Force:
Find all the cells that have 0; take two lists add the rows and cols to them; iterate over the matrix and for the values in lists set rows to zero. for setting up make another function that sets all rows and cols to zero one by one and separately.
### Better Approach:
First, we will declare two arrays: a row array of size N and a col array of size M and both are initialized with 0.
Then, we will use two loops(nested loops) to traverse all the cells of the matrix.
If any cell (i,j) contains the value 0, we will mark ith index of row array i.e. row[i] and jth index of col array col[j] as -1. It signifies that all the elements in the ith row and jth column will be 0 in the final matrix.
We will perform step 3 for every cell containing 0.
Finally, we will again traverse the entire matrix and we will put 0 into all the cells (i, j) for which either row[i] or col[j] is marked as -1.

## [118. Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/description/)
Given an integer numRows, return the first numRows of Pascal's triangle. In Pascal's triangle, each number is the sum of the two numbers directly above it.

    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> pascalTriangle = new ArrayList<>();
    
            // first and last element in each row is 1 & rest is/are:
            // pascalTriangle[row-1][col - 1] + pascalTriangle[row-1][col].
    
            for(int row = 0; row < numRows; row++){
                // initializing new row.
                List<Integer> triangleRow = new ArrayList<>();
    
                // col will be upto row as each row has elements corresponding to it.
                for(int col = 0; col <= row; col++){
                    if(col == 0 || col == row) triangleRow.add(1);
                    else{
                        triangleRow.add(pascalTriangle.get(row-1).get(col-1) + pascalTriangle.get(row-1).get(col));   
                    } 
                }
                pascalTriangle.add(triangleRow);
            }
            return pascalTriangle;
        }
    }
### Mathematical Approach
The first and Last Elements of each row will be 1; Each row will have elements equivalent to that row; Lastly, apply the formula: 
``pascalTriangle[row-1][col - 1] + pascalTriangle[row-1][col]``

## [31. Next Permutation](https://leetcode.com/problems/next-permutation/description/)
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such an arrangement is not possible, the array must be rearranged in the lowest possible order (i.e., sorted in ascending order).
`For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.`
Given an array of integers nums, find the next permutation of nums. The replacement must be in place and use only constant extra memory.

    class Solution {
        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int start = n - 1;
            int pivot = -1;
    
            while(start > 0 && nums[start] <= nums[start - 1]) start--;
            pivot = start - 1;
    
            if(pivot >= 0){
                int pivotSuffix = n - 1;
                while(pivotSuffix >= 0 && nums[pivot] >= nums[pivotSuffix]) pivotSuffix--;
                swap(nums, pivot, pivotSuffix);
            }
            reverseSuffix(nums, start, n-1);
        }
        void swap(int[] a, int i, int j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        void reverseSuffix(int[] a, int i, int j){
            while(i < j) swap(a, i++, j--);
        }
    }
Find largest index i such that `array[i − 1] < array[i]`.(If no such i exists, then this is already the last permutation.)
Find largest index j such that `j ≥ i` and `array[j] > array[i − 1]`.
Swap `array[j]` and `array[i − 1]`.
Reverse the suffix starting at `array[i]`.

## [53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/)
#### Kadane's Algorithm
Given an integer array nums, find the subarray with the largest sum, and return its sum.

    // A subarray is a contiguous non-empty sequence of elements within an array.
    class Solution {
        public int maxSubArray(int[] nums) {
            int currentSum = nums[0];
            int maxSum = nums[0];
            
            for(int i = 1; i < nums.length; i++){
                // if the currentSum + nums[i] goes below currentSum we will not consider it
                // as it will decrease the value and we want maximum as the answer.
               currentSum = Math.max(nums[i], currentSum + nums[i]);
               maxSum = Math.max(maxSum, currentSum);
            }
            return maxSum;
        }
    }
For each element `nums[i]`, calculate the maximum between `nums[i]` itself and the sum of the current subarray `(currentSum) plus nums[i]`. This step ensures that we either `start a new` subarray at `nums[i]` or `extend` the existing subarray with `nums[i]` if it results in a larger sum.
Update `currentSum` with the maximum value obtained from the previous step.
Update `maxSum` with the maximum value between the previous `maxSum` and the updated `currentSum`.

## [75. Sort Colors](https://leetcode.com/problems/sort-colors/description/)
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue. We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively. You must solve this problem without using the library's sort function.

    class Solution {
        public void sortColors(int[] nums) {
            int countZero = 0;
            int countOne = 0;
            int countTwo = 0;
    
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0) countZero++;
                else if(nums[i] == 1) countOne++;
                else countTwo++;
            }
    
            for(int i = 0; i < countZero; i++) nums[i] = 0;
            for(int i = countZero; i < countZero + countOne; i++) nums[i] = 1;
            for(int i = countZero + countOne; i < countZero + countOne + countTwo; i++) nums[i] = 2;
        }
    }
Take 3 variables to maintain the count of 0, 1 and 2.
Travel the array once and increment the corresponding counting variables
In 2nd traversal of array, we will now over write the first ‘a’ indices / positions in array with ’0’, the next ‘b’ with ‘1’ and the remaining ‘c’ with ‘2’.

    // Dutch National Flag Algorithm. 
    class Solution {
        public void sortColors(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;
    
            while(mid <= high){
                if(nums[mid] == 0){
                    swap(nums, low, mid);
                    low++;
                    mid++;
                }
                else if(nums[mid] == 1) mid++;
                else{
                    swap(nums, mid, high);
                    high--;
                }
            }
        }
    
        void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
#### Dutch National Flag Algorithm
If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid. Now the subarray from index 0 to (low-1) only contains 0.
If arr[mid] == 1, we will just increment the mid pointer and then the index (mid-1) will point to 1 as it should according to the rules.
If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high. Now the subarray from index high+1 to (n-1) only contains 2.
In this step, we will do nothing to the mid-pointer as even after swapping, the subarray from mid to high(after decrementing high) might be unsorted. So, we will check the value of mid again in the next iteration.

## [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)
You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

    class Solution {
        public int maxProfit(int[] prices) {
            int n = prices.length;
            int minPrice = prices[0];
            int profit = 0;
    
            for(int i = 0; i < n; i++){
                minPrice = Math.min(minPrice, prices[i]);
                int currentProfit = prices[i] - minPrice;
                profit = Math.max(profit, currentProfit);
            }
            return profit;
        }
    }
Find min: which is the minimum of the current price and the current minimum.
Find currentProfit: which is the current price minus the current minimum.
Find profit: which is the maximum of current profit and profit.

## [29. Divide Two Integers](https://leetcode.com/problems/divide-two-integers/description/)
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
Return the quotient after dividing dividend by divisor.
Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

#### Intuition
The division operation is essentially a repeated subtraction process. We can think of it as finding out how many times the divisor can be subtracted from the dividend before the dividend becomes smaller than the divisor.

#### Approach
1. Handle the special case where the dividend is Integer.MIN_VALUE and the divisor is -1, as this case would result in an overflow. In this case, return Integer.MAX_VALUE.
2. Determine the sign of the result based on the signs of the dividend and divisor.
3. Convert both the dividend and divisor to long to avoid potential integer overflow during calculations.
4. Initialize a variable "quotient" to keep track of the result of the division.
5. Use a while loop to repeatedly subtract a portion of the divisor from the dividend until the dividend becomes smaller than the divisor.
6. Inside the loop, start with a temporary variable "temp" set to the value of the divisor and a "multiple" variable set to 1.
7. Use a nested while loop to double both "temp" and "multiple" as long as subtracting "temp" from the dividend would still be valid.
8. After the nested loop, subtract "temp" from the dividend and add "multiple" to the quotient to keep track of the division result.
9. Continue this process until the dividend becomes smaller than the divisor.
10. Adjust the final result by multiplying it with the previously determined sign.
11. Return the result, ensuring it's within the 32-bit signed integer range.

#### Complexity
- Time complexity:
The time complexity of this approach is approximately O(log N), where N is the value of the dividend. This is because the divisor is doubled in each iteration of the loop until it becomes greater than the remaining dividend.

- Space complexity:
The space complexity is O(1), as only a few variables are used to keep track of the calculations and no additional data structures are used.

#### Code
```
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        
        long quotient = 0;
        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            long multiple = 1;
            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            ldividend -= temp;
            quotient += multiple;
        }
        
        return (int) (sign * quotient);
    }
}

```



