package ss1_introduction_to_java;

import java.util.Scanner;

public class Numb {
    public static void main(String[] args) {
        System.out.println("Nhập số bất kỳ: ");
        Scanner numbInput = new Scanner(System.in);
        int numbOutput = Integer.parseInt(numbInput.nextLine());
        if (numbOutput < 10 && numbOutput>=0) {
            switch (numbOutput) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (numbOutput>=10 && numbOutput<20) {
            switch (numbOutput) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eigthteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (numbOutput >=20 && numbOutput <100) {
            switch (numbOutput/10) {
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
            switch (numbOutput%10) {
                case 0:
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else {
            switch (numbOutput/100) {
                case 1:
                    System.out.print("One hundred and ");
                    break;
                case 2:
                    System.out.print("Two hundred and ");
                    break;
                case 3:
                    System.out.print("Three hundred and ");
                    break;
                case 4:
                    System.out.print("Four hundred and ");
                    break;
                case 5:
                    System.out.print("Five hundred and ");
                    break;
                case 6:
                    System.out.print("Six hundred and ");
                    break;
                case 7:
                    System.out.print("Seven hundred and ");
                    break;
                case 8:
                    System.out.print("Eight hundred and ");
                    break;
                case 9:
                    System.out.print("Nine hundred and ");
                    break;
                default:
                    System.out.println("out of ability");
            }
            if (numbOutput/10%10 == 0) {
                System.out.println("");
            } else if (numbOutput/10%10 == 1) {
                switch (numbOutput%100) {
                    case 10:
                        System.out.print("Ten");
                        break;
                    case 11:
                        System.out.print("Eleven");
                        break;
                    case 12:
                        System.out.print("Twelve");
                        break;
                    case 13:
                        System.out.print("Thirteen");
                        break;
                    case 14:
                        System.out.print("Fourteen");
                        break;
                    case 15:
                        System.out.print("Fifteen");
                        break;
                    case 16:
                        System.out.print("Sixteen");
                        break;
                    case 17:
                        System.out.print("Seventeen");
                        break;
                    case 18:
                        System.out.print("Eigthteen");
                        break;
                    case 19:
                        System.out.print("Nineteen");
                        break;
                }
            } else {
                switch (numbOutput/10%10) {
                    case 2:
                        System.out.print("Twenty ");
                        break;
                    case 3:
                        System.out.print("Thirty ");
                        break;
                    case 4:
                        System.out.print("Forty ");
                        break;
                    case 5:
                        System.out.print("Fifty ");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy ");
                        break;
                    case 8:
                        System.out.print("Eighty ");
                        break;
                    case 9:
                        System.out.print("Ninety ");
                        break;
                }
                switch (numbOutput%100%10) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
            }
        }
    }
}



