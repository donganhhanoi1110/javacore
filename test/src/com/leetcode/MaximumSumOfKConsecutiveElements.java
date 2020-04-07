package com.algorithm;

import java.util.Scanner;

/**
 *
 * WINDOW SLIDING TECHNIQUE
 * https://www.geeksforgeeks.org/window-sliding-technique/
 * Given an array of integers of size ‘n’.
 * Our aim is to calculate the maximum sum of ‘k’
 * consecutive elements in the array.
 *
 * Input  : arr[] = {100, 200, 300, 400}
 *          k = 2
 * Output : 700
 *
 * Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
 *          k = 4
 * Output : 39
 * We get maximum sum by adding subarray {4, 2, 10, 23}
 * of size 4.
 *
 * Input  : arr[] = {2, 3}
 *          k = 3
 * Output : Invalid
 * There is no subarray of size 3 as size of whole
 * array is 2.
 */
public class MaximumSumOfKConsecutiveElements {

    /**
     *
     * @param nums
     * @return
     */
    public static int  maxSum1(int[] nums, int k) {

        int maxSum = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            int currentSum = 0
           for (int j = 0; j < k; j++) {
               currentSum += nums[i + j];
           }
           if (currentSum > maxSum) {
               maxSum = currentSum;
           }
        }
        return maxSum;

    }

    public static void main (String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum1(arr, n, k));
    }


}