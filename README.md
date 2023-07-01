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





