package ss11_DSA_queue_stack.check_palindrome_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        Stack<String> myStackArr = new Stack<>();
        Queue<String> myQueueArr = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        String strLowerCase = str.toLowerCase();
        for (int i = 0; i < str.length() ; i++) {
            myStackArr.push(strLowerCase.charAt(i) + "");
            myQueueArr.offer(strLowerCase.charAt(i) + "");
        }
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            String stackChar = myStackArr.pop();
            String queuehar = myQueueArr.poll();
            if (!stackChar.equals(queuehar)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Chuỗi nhập là chuỗi palindrome");
        } else {
            System.out.println("Chuỗi nhập không phải là chuỗi palindrome");
        }
    }
}
