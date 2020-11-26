package app;

import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int diagonalDifference(List<List<Integer>> arr) {
    int convertedMatrix [][] = convert(arr);

    int firstDiagonal = 0;
    int secondDiagonal = 0;
    int size = convertedMatrix.length;

    for (int i = 0; i < size; i++) {
      firstDiagonal = firstDiagonal + convertedMatrix[i][i];
      secondDiagonal = secondDiagonal + convertedMatrix[i][size-i-1];
    }
    return Math.abs(firstDiagonal-secondDiagonal);


  }

  public static int[][] convert(List<List<Integer>> a) {
    int size = a.size();
    int[][] res = new int[size][size];
    IntStream.range(0, size).forEach(y ->
            IntStream.range(0, size).forEach(x ->
                    res[y][x] = a.get(y).get(x)));
    return res;
  }

}
