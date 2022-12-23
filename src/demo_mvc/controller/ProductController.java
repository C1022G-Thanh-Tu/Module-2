package demo_mvc.controller;

import demo_mvc.model.model.Product;
import demo_mvc.model.service.IProductService;
import demo_mvc.model.service.ProductService;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args)  {
        IProductService productService = new ProductService();
        productService.create();
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Hãy nhập link file cần truy cập: ");
//        final String FILE_NAME = scanner.nextLine();
        do {
            System.out.println("-----Product Manager-------");
            System.out.println("1. Thêm sản phẩm");;
            System.out.println("2. Lấy danh sách sản phẩm");
            System.out.println("3. Tìm sản phẩm theo tên");
            System.out.println("4. Thoát lựa chọn");
            System.out.print("Hãy nhập lựa chọn: ");
            int choice = 0;
            boolean flag = true;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    flag = false;
                } catch (NumberFormatException e) {
                    System.err.println("Hãy nhập số để lựa chọn dịch vụ");
                    flag = true;
                }
            } while (flag);
            switch (choice) {
                case 1:
                    int id = 0;
                    do {
                        try {
                            System.out.print("Nhập id: ");
                            id = Integer.parseInt(scanner.nextLine());
                            flag = false;
                        } catch (NumberFormatException e) {
                            System.out.println("Hãy nhập giá trị là số");
                            flag = true;
                        }
                    } while (flag);
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập hãng xản xuất: ");
                    String manufacturer = scanner.nextLine();
                    int price = 0;
                    do {
                        try {
                            System.out.print("Nhập giá: ");
                            price = Integer.parseInt(scanner.nextLine());
                            flag = false;
                        } catch (NumberFormatException e) {
                            System.out.println("Hãy nhập giá trị là số");
                            flag = true;
                        }
                    } while (flag);
                    Product product = new Product(id, name, manufacturer, price);
                    productService.add(product);
                    break;
                case 2:

                    break;
                case 3:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    name = scanner.nextLine();
                    if (productService.search(name) != null) {
                        System.out.println(productService.search(name));
                    } else {
                        System.out.println("Không tìm thấy sản phẩm theo tên tương ứng");
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
