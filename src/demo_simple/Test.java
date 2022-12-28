package demo_simple;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        String arg1 = "abcbdcef";
        List<String> arr = new ArrayList<>();
        String[] strArr = arg1.split("");
        for (int i = 0; i < strArr.length; i++) {
            int count =0;
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])) {
                    count++;
                }
            }
            if (count==2) {
                if (!arr.contains(strArr[i])) {
                    arr.add(strArr[i]);
                }

            }
        }
        System.out.println(arr);
    }
 }
