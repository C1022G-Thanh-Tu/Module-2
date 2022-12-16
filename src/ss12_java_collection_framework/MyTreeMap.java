package ss12_java_collection_framework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> myTreeMapList = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine().toLowerCase();
        for (int i = 0; i < str.length() ; i++) {
            if (myTreeMapList.containsKey(str.charAt(i)+"")) {
                myTreeMapList.put(str.charAt(i)+"", myTreeMapList.get(str.charAt(i)+"")+1);
            } else {
                myTreeMapList.put(str.charAt(i)+"", 1);
            }
        }
        System.out.println("Số lần xuất hiện của các ký tự có trong chuỗi là:");
        for (Map.Entry<String, Integer> entry : myTreeMapList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ");
        }
    }
}
