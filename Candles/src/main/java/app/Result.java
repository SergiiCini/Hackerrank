package app;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'birthdayCakeCandles' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY candles as parameter.
   */

  public static void birthdayCakeCandles1(int [] candles) {
    int tallest = candles[0];
    int candlesAm = 0;
    for(int i = 0; i < candles.length; i++){
      if(tallest < candles[i]){
        tallest = candles[i];
      }
    }
    for(int item: candles) {
      if(item == tallest) {
        candlesAm = candlesAm + 1;
      };
    }
    System.out.println(candlesAm);
  }

  public static void birthdayCakeCandles(int [] candles) {
    int max = Integer.MIN_VALUE;
    int counter = 0;
    for(int item: candles) {
      if(item > max) {
        max = item;
        counter = 1;
      } else if (item == max) {
        counter++;
      }
    }
    System.out.println(counter);
  }


  public static void main(String[] args) {
    int[] candlesArr = {4, 2, 4, 1};
    birthdayCakeCandles(candlesArr);
  }
}

//public class Solution {
//  public static void main(String[] args) throws IOException {
//    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//    int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//    List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//    int result = Result.birthdayCakeCandles(candles);
//
//    bufferedWriter.write(String.valueOf(result));
//    bufferedWriter.newLine();
//
//    bufferedReader.close();
//    bufferedWriter.close();
//  }
//}
