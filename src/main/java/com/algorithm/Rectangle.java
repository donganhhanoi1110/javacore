package com.algorithm;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * The rectangle is a plane figure with four straight sides and four right angles. Therefore, to build a rectangle, 4 points are needed. Given 3 points of a rectangle, figure out the last point to make a rectangle.
 *
 * v is an array, containing 3 points of a triangle. By using v, make a solution function which returns the last point to make a rectangle.
 *
 * Note
 *
 * v is an array, containing 3 points of a triangle.
 * Each of v's element has x and y coordinates, which represents a point of a rectangle.
 * In v, two points can be connected either with a vertical or horizontal line.
 * Each coordinate is a natural number, less than or equal to 10 billion.
 * Return the last point, [coordiante x, coordinate y].
 *
 * v	                        result
 * [[1, 4], [3, 4], [3, 10]]	[1, 10]
 * [[1, 1], [2, 2], [1, 2]]	    [2, 1]
 */
public class Rectangle {

    //3 points, 2 xy: int[][] v = new int[3][2]
    public static int[] solution(int[][] v) {
        int[] answer = new int [2];
        Set<Integer> foundValues = new HashSet<>();
        List<Integer> squarePoints = new ArrayList<>();
        int[] xArr = new int[3];
        int[] yArr = new int [3];
        for (int i = 0; i < v.length ; i++) {
            if (v[i][0] == v[i][1]) {
                squarePoints.add(i);
            }
            xArr[i] = v[i][0];
            yArr[i] = v[i][1];

            for (int j = 0; j < 2; j++) {
                boolean found = false;
                for (int k = 0; k < v.length ; k++) {
                    List<Integer> otherPoints = Arrays.stream(v[k]).boxed().collect(Collectors.toList());
                    if (k != i && otherPoints.contains(v[i][j])) {
                        found = true;
                    }
                }
                if (!found) {
                    foundValues.add(v[i][j]);
                }
            }
        }

        // 2 point which has x and y same value means SQUARE
        if (squarePoints.size() == 2) {
            for (int i = 0; i < v.length ; i++) {
                if (!squarePoints.contains(i)) {
                    int[] thirdPoint = v[i];
                    answer[0] = thirdPoint[1];
                    answer[1] = thirdPoint[0];
                    return answer;
                }
            }
        } else {
            foundValues.forEach( val -> {
                int x = Arrays.binarySearch(xArr, val);
                if (x >= 0) {
                    answer[0] = val;
                }
                int y = Arrays.binarySearch(yArr, val);
                if (y >= 0) {
                    answer[1] = val;
                }
            });
            return answer;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException
    {
        int[][] v1 = {{1,4},{3,4},{3,10}};

        for (int i : solution(v1)) {
            System.out.println(i);
        }


        int[][] v2 = {{1,1},{2,2},{1,2}};

        for (int i : solution(v2)) {
            System.out.println(i);
        }






    }

}
