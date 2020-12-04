package app;

public class MaxMin {

  static void miniMaxSum(int[] arr) {
    long min = arr[0];
    long max = arr[0];
    long sum = 0;
    for(int i = 0; i < arr.length; i++){
      if(min > arr[i]){
        min = arr[i];

      } else if(arr[i]>max){
        max = arr[i];
      }
      sum = sum+arr[i];
    }
    long sum1 = sum - min;
    long sum2 = sum - max;
    System.out.println(sum1+" "+sum2);
  }

//  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int[] arr = new int[5];
    int [] array = {7, 69, 2, 221, 8974};
    miniMaxSum(array);

//    String[] arrItems = scanner.nextLine().split(" ");
//    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//    for (int i = 0; i < 5; i++) {
//      int arrItem = Integer.parseInt(arrItems[i]);
//      arr[i] = arrItem;
//    }
//
//    miniMaxSum(arr);
//
//    scanner.close();
  }

}
