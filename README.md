
# LeetCode Challenge D6


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2643.  Row With Maximum Ones](https://leetcode.com/problems/row-with-maximum-ones/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
The problem was to find the index and count of ones in the row with the maximum number of ones in a binary matrix `mat`. If multiple rows have the same maximum count, select the one with the smallest row number. Finally, return an array containing the index and the count of ones in the chosen row.



**Example**

>**Input:** mat = [[0,1],[1,0]]
>
>**Output:** [0,1]

>**Explanation:** Both rows have the same number of 1's. So we return the index of the smaller row, 0, and the maximum count of ones (`1`). So, the answer is [0,1].

**Language Used**
> Java

**Difficulty**

> Easy



## Solution Overview
This solution iterates through each row of the binary matrix, accumulating the count of ones for each row and storing these counts in the `countArray`. It then identifies the row index (`rowNo`) with the maximum count of ones by comparing the counts in the `countArray`. The final result is an array containing the index of the row with the maximum ones count (`rowNo`) and the count itself, forming the output `[rowNo, count]`.
