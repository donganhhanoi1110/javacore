package com.algorithm;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class FirstReverse {

    //QA1
    public static boolean isAlphabet(String str) {
        return (str != null && (str.matches("[a-zA-Z ]*")));
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static List<String> preserveString(List<String> strList) {
        List<String> returnArr = new ArrayList<>();
        if (strList != null) {
            for (String s : strList) {
                String[] arrSpace = s.split(" ");
                StringBuilder stringBuilder = new StringBuilder();
                for (String s1 : arrSpace) {
                    if (isAlphabet(s1)) {
                        stringBuilder.append(reverseString(s1) + " ");
                    }
                }
                if (!stringBuilder.toString().isEmpty()) {
                    returnArr.add(stringBuilder.toString());
                }
            }
        }
        return returnArr;
    }

    //QA3
    public static void findSumPair(List<String> strList) {
        String data = strList.get(0);

        if (data != null && !data.isEmpty()) {
            Integer target = Integer.parseInt(strList.get(1));
            String[] arrSpace = data.split(" ");
            if (arrSpace != null && arrSpace.length > 0) {
                Integer[] intSpace = new Integer[arrSpace.length];
                for (int i=0; i< arrSpace.length; i++) {
                    intSpace[i] = Integer.parseInt(arrSpace[i]);
                }
                System.out.println(findTwoNum(intSpace, target));
            }

        }

    }

    /**
     * Algorithm Complexity: Depends on the sorting algorithm we use.
     * Collections.sort is stable and runs in O(n log n) time (worst case).
     * @param arr
     * @param target
     * @return
     */
    public static String findTwoNum(Integer[] arr, int target) {
        List<Integer> list = Arrays.asList(arr);
        //1. Sort the array in ascending order
        Collections.sort(list);
        /**
         *  2. 2 variables: i from the start, j from the end
         *  We move these 2 i and j to the middle and sum it until we find the sum = target
         */
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (list.get(i) + list.get(j) == target) {
                return list.get(i) + " " + list.get(j);
            } else if (list.get(i) + list.get(j) < target)
                i++;
            else // mean i + j > target
                j--;
        }

        return "-1";

    }


    public static String FirstReverse(String arg) {

        // code goes here
        /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        StringBuilder newReverseStr = new StringBuilder();
        for (int i = arg.length() - 1; i == 0; i--) {
            newReverseStr = newReverseStr.append(arg.charAt(i));
        }
        return new String(newReverseStr);

    }


    //QA4
    static List<String> queue = new ArrayList<>();

    public static boolean OFFER(String arg, int maxSize) {

        if (queue.size() >= maxSize) {
            return false;
        } else {
            return queue.add(arg);
        }
    }

    public static int SIZE() {
       return queue == null ? 0 : queue.size();
    }

    public static String TAKE() {
        if (queue != null && queue.size() > 0) {
            StringBuilder str = new StringBuilder(queue.get(0));
            queue.remove(0);
            return str.toString();
        } else {
            return "";
        }
    }

    public static List<String> myQueue(List<String> strList) {
        List<String> returnArr = new ArrayList<>();
        if (strList != null) {
            String[] line1 = strList.get(0).split(" ");
            Integer commands = Integer.parseInt(line1[0]);
            Integer maxSize = Integer.parseInt(line1[1]);
            for (int i = 1; i< strList.size(); i++) {
                if (i <= commands) {
                    if (strList.get(i).startsWith("OFFER")) {
                        String offer = strList.get(i).replace("OFFER ", "");
                        returnArr.add(OFFER(offer, maxSize) + "");
                    } else if (strList.get(i).startsWith("TAKE")) {
                        returnArr.add(TAKE());
                    } else if (strList.get(i).startsWith("SIZE")) {
                        returnArr.add(SIZE() + "");
                    }
                }
            }
        }
        return returnArr;
    }


    //QA6
    public static void myCycle(List<String> strList) {
        if (strList != null) {
            Integer maxSize = Integer.parseInt(strList.get(0));
            int[][] cycle = new int[maxSize][2];
            for (int i = 1; i< strList.size(); i++) {
                String[] arrSpace = strList.get(i).split(" ");
                if (arrSpace != null && arrSpace.length > 0) {
                    int[] intSpace = new int[2];
                    for (int s=0; s < 2; s++) {
                        intSpace[s] = Integer.parseInt(arrSpace[s]);
                    }
                    cycle[i-1] = intSpace;
                }
            }

            System.out.println(solution(cycle) + "");
        }
    }

    public static boolean solution(int[][] v) {
        boolean[] checkItem = new boolean[v.length - 1];

        int checkInd = 0;
        for (int i = 1; i < v.length; i++) {
            if (i != v.length - 1) {
                if (v[i][0] == v[i - 1][1] && v[i][1] == v[i + 1][0]) {
                    checkItem[checkInd] = true;
                } else {
                    checkItem[checkInd] = false;
                }
            } else {
                if (v[i][0] == v[i - 1][1] && v[i][1] == v[0][0]) {
                    checkItem[checkInd] = true;
                } else {
                    checkItem[checkInd] = false;
                }
            }
            checkInd++;
        }
        for (boolean item : checkItem) {
            if (item == false) {
                return false;
            }
         }
         return true;
    }

    //QA7
    public static void myWindow(List<String> strList) {
        if (strList != null) {
            Integer w = Integer.parseInt(strList.get(0));
            int[] s = new int[strList.size() - 1];
            for (int i = 1; i < strList.size(); i++) {
                s[i-1] = Integer.parseInt(strList.get(i));
            }

            for (int i = 1; i < s.length; i ++ ) {
                if (s[i] < w) {
                    System.out.println(w);
                } else {
                    System.out.println(s[i]);
                }
            }

        }
    }

    public static void main (String[] args) throws IOException {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        List<String> data = new ArrayList<>();
        data.add("2");
        data.add("2");
        data.add("1");
        data.add("2");
        data.add("-1");
        data.add("3");




//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String tmp;
//        while ((tmp = br.readLine()) != null) {
//            data.add(tmp);
//        }


//        for (String s : myQueue(data)) {
//            System.out.println(s);
//        }


        //findSumPair(data);
        //myCycle(data);
        myWindow(data);
    }
}
