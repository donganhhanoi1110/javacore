package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class PairSum {

    /**
     * Time Complexity: O(N)
     * Auxiliary Space Complexity: O(1)
     * @param arr
     * @param sum
     */
    public static boolean pairSum(int[] arr, int sum) {
        int leftPoint = 0;
        int rightPoint = arr.length - 1;

        //Step 1: sort the array in ascending order
        // quick sort O(nlogn)
        Arrays.sort(arr);

        //O(n)
        while (leftPoint < rightPoint) {
            if ((arr[leftPoint] + arr[rightPoint]) == sum) {
                return true;
            } else if ((arr[leftPoint] + arr[rightPoint]) < sum) {
                leftPoint++;
            } else {
                rightPoint--;
            }

        }
        return false;
    }

    public static boolean pairSum2(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];

            if (set.contains(temp)) {
                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }


    /**
     * You're given strings J representing the types of stones that are jewels, and S representing the
     * stones you have. Each character in S is a type of stone you have. You want to know how
     * many of the stones you have are also jewels.
     * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are
     * case sensitive, so "a" is considered a different type of stone from "A".
     * Example 1:
     * Input: J = "aA", S = "aAAbbbb"
     * Output: 3
     * Example 2:
     * Input: J = "z", S = "ZZ"
     * Output: 0
     * Note:
     * • S and J will consist of letters and have length at most 50.
     * • The characters in J are distinct.
     *
     * @param jewel
     * @param stone
     * @return
     */
    public static int jsStone(String[] jewel, String[] stone) {
        HashSet<String> set = new HashSet<>();
        for (String j: jewel) {
            set.add(j);
        }

        int count = 0;
        for (int i = 0; i < stone.length; i++) {
            if (set.contains(stone[i])) {
               count++;
            }
        }

        return count;
    }

    public static void main (String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };

        System.out.println(pairSum(arr, 12));
        System.out.println(pairSum(arr, 20));
        System.out.println(pairSum(arr, 19));

        System.out.println(pairSum2(arr, 12));
        System.out.println(pairSum2(arr, 20));
        System.out.println(pairSum2(arr, 19));


        String J = "aA", S = "aAAbbbb";
        String[] jarr = J.split("");
        String[] sarr = S.split("");

        System.out.println(jsStone(jarr, sarr));

        String j2 = "z", s2 = "ZZ";
        String[] jarr2 = j2.split("");
        String[] sarr2 = s2.split("");

        System.out.println(jsStone(jarr2, sarr2));
    }


}
