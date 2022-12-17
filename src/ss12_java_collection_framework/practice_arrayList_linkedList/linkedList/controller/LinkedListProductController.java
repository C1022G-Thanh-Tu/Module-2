package ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.controller;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.service.IArrayListProductManagerService;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.service.ArrayListProductManagerService;

import java.util.Scanner;

public class LinkedListProductController {
    private static final IArrayListProductManagerService productService = new ArrayListProductManagerService();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("-----Product Manager-------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Điều chỉnh sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Lấy danh sách sản phẩm");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo thứ tự giá tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo thứ tự giá giảm dần");
            System.out.print("Hãy chọn một dịch vụ: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    System.out.print("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập giá: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    productService.addProduct(new ArrayListProduct(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhập id cần sửa: ");
                    int idNeedFixed = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập id mới: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập giá: ");
                    price = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên sản phẩm: ");
                    name = scanner.nextLine();
                    productService.updateProduct(idNeedFixed, new ArrayListProduct(id, name, price));
                    break;
                case 3:
                    System.out.print("Nhập id: ");
                    id = Integer.parseInt(scanner.nextLine());
                    productService.removeProduct(id);
                    break;
                case 4:
                    productService.listProduct();
                    break;
                case 5:
                    System.out.print("Nhập tên sản phẩm: ");
                    name = scanner.nextLine();
                    productService.searchProduct(name);
                    break;
                case 6:
                    productService.sortAscendingOrder();
                    break;
                case 7:
                    productService.sortDescendingOrder();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}