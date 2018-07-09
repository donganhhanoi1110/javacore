package test;

class TwoDimensionalArray{

	 //https://www.hackerrank.com/challenges/diagonal-difference/problem
    /**
    Raw Input Format
    
    The first line contains a single integer,  denoting the number of rows and columns in the matrix . 
    The next  lines denote the matrix 's rows, with each line containing  space-separated integers describing the columns.
    
    Sample Input 0
    
    3
    11 2 4
    4 5 6
    10 8 -12
   */
   public static void main(String args[]){
     int[][] a = new int[][]{
       { 1, 2, 3, 4, 5},
       { 1, 2, 3, 4, 5},
       { 1, 2, 3, 4, 5},
       { 1, 2, 3, 4, 5},
       { 1, 2, 3, 4, 5}
     };
     
     int first = 0;
     int second = 0;
     int j = a.length;
     int k = 0;
     for (int i = 0; i < a.length ; i++) {
       first += a[i][--j];
       second += a[i][k++];
       System.out.println(first + " " + second );
     }
     int sum = Math.abs(first - second);
     System.out.println(sum);
   }
}