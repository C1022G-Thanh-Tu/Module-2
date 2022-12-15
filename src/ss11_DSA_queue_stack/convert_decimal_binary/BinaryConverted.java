package ss11_DSA_queue_stack.convert_decimal_binary;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BinaryConverted {
    public static void main(String[] args) {
        Stack<Integer> myStackArr = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bất kỳ: ");
        int numbInput = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhị phân của "+numbInput+" là: ");
        int surplus = 0;
        while (numbInput > 0) {
            surplus = numbInput % 2;
            myStackArr.push(surplus);
            numbInput = numbInput / 2;
        }
        int size = myStackArr.size();
        for (int i = 0; i < size ; i++) {
            System.out.print(myStackArr.pop());
        }
    }
}
