package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.controller;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.Product;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.service.IProductManagerService;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.service.ProductManagerService;

import java.util.List;
import java.util.Scanner;

public class ProductController {
    private static final IProductManagerService productService = new ProductManagerService();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("-----Product Manager-------");
            System.out.println("1. Add");
            System.out.println("2. Update");
            System.out.println("3. Remove");
            System.out.println("4. List");
            System.out.println("5. Search");
            System.out.println("6. Sort Ascending Order");
            System.out.println("7. Sort Descending Order");
            System.out.println("8. Exit");
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
                    productService.addProduct(new Product(id, price, name));
                    break;
                case 2:
                    System.out.print("Nhập id cần sửa: ");
                    int idFix = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập id: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập giá: ");
                    price = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên sản phẩm: ");
                    name = scanner.nextLine();
                    productService.updateProduct(idFix, idFix-1,
                            new Product(id, price, name), new Product(idFix, price, name));
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