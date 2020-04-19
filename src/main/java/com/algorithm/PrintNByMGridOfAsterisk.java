package com.algorithm;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 *※ Use Standrad input and output to solve this challenge
 *
 * Print a n by m grid of asterisks.
 *
 * Constrratins
 * The first line contains 2-separated integers, n and m.
 *
 * 1 ≤ n, m ≤ 1,000
 * Examples
 * Input
 *
 * 5 3
 * Output
 *
 * *****
 * *****
 * *****
 */
public class PrintNByMGridOfAsterisk {

    public static void solution(int a, int b) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a ; j++) {
                str.append("*");
                if (j == a-1) {
                    str.append("\n");
                }
            }
        }
        System.out.print(str.toString());
    }

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        solution(a, b);
    }

}
