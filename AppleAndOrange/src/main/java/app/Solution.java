package app;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  // Complete the countApplesAndOranges function below.
  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

    int counter1 = 0;
    int counter2 = 0;
    for (int i = 0; i < apples.length; i++) {
      if (a + apples[i] >= s && a + apples[i] <= t) {
        counter1 ++;
      }
    }
    for (int i = 0; i < oranges.length; i++){
      if (b + oranges[i] >= s && b + oranges[i] <= t){
        counter2 ++;
      }
    }
    System.out.printf("%d\n%d\n", counter1, counter2);

  }

  public static void main(String[] args) {
    int s = 7;
    int t = 10;
    int a = 4;
    int b = 12;
    int[] apples = {2,3,-4};
    int[] oranges = {3,-3,-4};
    countApplesAndOranges(s, t, a, b, apples, oranges);
  }
}

//  private static final Scanner scanner = new Scanner(System.in);

//  public static void main(String[] args) {
//    String[] st = scanner.nextLine().split(" ");
//
//    int s = Integer.parseInt(st[0]);
//
//    int t = Integer.parseInt(st[1]);
//
//    String[] ab = scanner.nextLine().split(" ");
//
//    int a = Integer.parseInt(ab[0]);
//
//    int b = Integer.parseInt(ab[1]);
//
//    String[] mn = scanner.nextLine().split(" ");
//
//    int m = Integer.parseInt(mn[0]);
//
//    int n = Integer.parseInt(mn[1]);
//
//    int[] apples = new int[m];
//
//    String[] applesItems = scanner.nextLine().split(" ");
//    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//    for (int i = 0; i < m; i++) {
//      int applesItem = Integer.parseInt(applesItems[i]);
//      apples[i] = applesItem;
//    }
//
//    int[] oranges = new int[n];
//
//    String[] orangesItems = scanner.nextLine().split(" ");
//    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//    for (int i = 0; i < n; i++) {
//      int orangesItem = Integer.parseInt(orangesItems[i]);
//      oranges[i] = orangesItem;
//    }
//
//    countApplesAndOranges(s, t, a, b, apples, oranges);
//
//    scanner.close();
//  }
//}
