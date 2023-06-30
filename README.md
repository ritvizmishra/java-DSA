### Leetcode Questions:
## [73. Set Matrix Zero](https://leetcode.com/problems/set-matrix-zeroes/description/)
Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.

![Screenshot (257)](https://github.com/ritvizmishra/java-DSA/assets/104827211/4c3c037b-317d-43dd-b0f5-d3b8d5e5e6da)
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

![Screenshot (258)](https://github.com/ritvizmishra/java-DSA/assets/104827211/3ec3bf37-f3bb-4c6e-baeb-8442ab9f440c)
### Mathematical Approach
The first and Last Elements of each row will be 1; Each row will have elements equivalent to that row; Lastly, apply the formula: 
``pascalTriangle[row-1][col - 1] + pascalTriangle[row-1][col]``


