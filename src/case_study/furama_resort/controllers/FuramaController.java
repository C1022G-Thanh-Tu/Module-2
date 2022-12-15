package case_study.furama_resort.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
//        public void displayMainMenu() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu gồm có:" +
                    " 1. Employee Management" +
                    ", 2. Customer Management" +
                    ", 3. Facility Management" +
                    ", 4. Booking Management" +
                    ", 5. Promotion Management" +
                    ", 6. Exit");
            System.out.print("Hãy chọn dịch vụ có trong menu");
            int numbInput1 = Integer.parseInt(scanner.nextLine());
            switch (numbInput1) {
                case 1:
                    System.out.println("Xin hãy chọn tiếp các dịch vụ sau: " +
                    " 1	Display list employees" +
                    ", 2	Add new employee" +
                    ", 3	Delete employee" +
                    ", 4	Edit employee" +
                    ", 5	Return main menu");
                    int numbInput2 = Integer.parseInt(scanner.nextLine());
                    if (numbInput2<5 && numbInput2>0) {
                        switch (numbInput2) {
                            case 1:
                                
                        }
                    }
            }
//        }
    }
}