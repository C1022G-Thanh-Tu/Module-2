package ss13_searching_algorithms;

import java.util.*;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine().toLowerCase();
        Map<String, Integer> myTreeMap = new TreeMap<>();
        for (int i = 0; i < str.length() ; i++) {
            if (myTreeMap.containsKey(str.charAt(i)+"")) {
                myTreeMap.put(str.charAt(i)+"", myTreeMap.get(str.charAt(i)+"")+1);
            } else {
                myTreeMap.put(str.charAt(i)+"", 1);
            }
        }
        int max = -1;
        String character = "";
        for (Map.Entry<String, Integer> entry : myTreeMap.entrySet()) {
            for (int i = 0; i < myTreeMap.size() ; i++) {
                if (max < entry.getValue()) {
                    max = entry.getValue();
                    character = entry.getKey();
                }
            }
        }
        System.out.println("Ký tự xuất hiện nhiều nhất trong mảng là: " + character + "\nCó số lần xuất hiện là: " + max);
    }
}
