package app;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String newString = "";
        if (s.endsWith("PM")) {
            String newS = s.substring(0, s.indexOf("PM"));
            String[] sArray = s.split(":");
            String[] lArray = sArray[2].split("PM");
            int lInt = Integer.parseInt(lArray[0]);
            if (sArray[0].contains("12")) {
                sArray[0] = "12";
            } else {
                int fInt = Integer.parseInt(sArray[0]) + 12;
                sArray[0] = Integer.toString(fInt);
            }
            newString = String.format("%s:%s:%d",sArray[0], sArray[1], lInt);
        } else if (s.contains("AM")) {
            String[] sArray = s.split(":");
            String[] lArray = sArray[2].split("AM");
            if (sArray[0].contains("12")) {
                sArray[0] = "00";
            }
            newString = sArray[0] + ":" + sArray[1] + ":" + lArray[0];
        }
        System.out.println(newString);
        return newString;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = "12:45:54PM";
        timeConversion(s);
//    BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//    String s = scan.nextLine();
//
//    String result = timeConversion(s);
//
//    bw.write(result);
//    bw.newLine();
//
//    bw.close();
    }
}
