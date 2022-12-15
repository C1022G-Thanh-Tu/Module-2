package ss11_DSA_queue_stack.reverse_value_stack;

import java.util.Scanner;
import java.util.Stack;

public class MyStackStringList {
    public static void main(String[] args) {
        Stack<String> myStringStackArr = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            myStringStackArr.push(str.charAt(i)+"");
        }
        System.out.print("Chuỗi đảo ngược là: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(myStringStackArr.pop());
        }
    }
}
