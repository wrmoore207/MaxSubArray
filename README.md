# Problem Description: Maximum Product Subarray

You are given an array of integers, nums, where each element represents an integer. Your task is to find the contiguous subarray with the maximum product of its elements.

Write a Java program that implements the solution for this problem using a divide-and-conquer approach. The program should consist of a class named Solution with the following methods:

## maxCrossing(nums, low, mid, high): 
* Given an array nums and the indices low, mid, and high, this method calculates the maximum product of a subarray that crosses the midpoint.

## maxSubArray(nums, low, high): 
* This recursive method divides the array into two halves and finds the maximum product subarray for the left, right, and crossing subarrays. It returns the maximum of these three values.

## 
* maxProduct(nums): The main method that initializes the length of the array and calls maxSubArray with appropriate parameters. It returns the maximum product subarray.

The program should include a Main class with a main method that demonstrates the usage of the Solution class. Initialize an array of integers, call the maxProduct method, and print the result to the console.

Ensure that your solution handles various edge cases and provides the correct output for different input scenarios.