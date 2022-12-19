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

//        Set<Map.Entry<String, Integer>> entrySet = myTreeMap.entrySet();
//        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
//
//        String character = entryList.get(0).getKey();
//        int max = entryList.get(0).getValue();
//        for (int i = 0; i < entryList.size(); i++) {
//            if (entryList.get(i).getValue() > max) {
//                max = entryList.get(i).getValue();
//                character = entryList.get(i).getKey();
//            }
//        }
//        System.out.println("Ký tự: "+ character + " có số lần xuất hiện nhiều nhất trong chuỗi: " + max);
    }
}
