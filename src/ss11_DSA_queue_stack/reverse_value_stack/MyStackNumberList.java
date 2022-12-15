package ss11_DSA_queue_stack.reverse_value_stack;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStackNumberList {
    public static void main(String[] args) {
        Stack<Integer> myStackNumbArr = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước cho myStackNumbArr: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i< n; i++) {
            System.out.print("Nhập phần tử cho myStackNumbArr: ");
            arr[i] = Integer.parseInt(scanner.nextLine());
            myStackNumbArr.push(arr[i]);
        }
        for (int i = 0; i < n ; i++) {
            arr[i] = myStackNumbArr.pop();
        }
        for (int i = 0; i < n ; i++) {
            myStackNumbArr.push(arr[i]);
        }
        System.out.println(myStackNumbArr);
    }
}
