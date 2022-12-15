package demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Stack<String> stackArr = new Stack<String>();
//        System.out.println("Nhập chuỗi");
//        String str = scanner.nextLine();
//        System.out.println(str.charAt(0));
//        for (int i = 0; i < str.length(); i++) {
//            stackArr.push(str.charAt(i)+"");
//        }
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(stackArr.pop());
//        }
//        Queue<String> danhSachSV = new PriorityQueue<>();
//        danhSachSV.offer("b");
//        danhSachSV.offer("a");
//        danhSachSV.offer("d");
//        danhSachSV.offer("c");
//        while (true) {
//            String name = danhSachSV.poll();
//            if (name == null) {
//                break;
//            }
//            System.out.println(name);
//        }
        Deque<String> danhSachSv = new ArrayDeque<String>();
        danhSachSv.offer("a");
        danhSachSv.offer("b");
        danhSachSv.offer("c");
        danhSachSv.offer("d");
        danhSachSv.offerLast("End");
        danhSachSv.offerFirst("Start");
        while (true) {
            String name = danhSachSv.poll();
            if (name == null) {
                break;
            }
            System.out.println(name);
        }
    }

}
