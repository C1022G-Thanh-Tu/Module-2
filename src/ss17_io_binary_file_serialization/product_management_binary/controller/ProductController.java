package ss17_io_binary_file_serialization.product_management_binary.controller;

import ss17_io_binary_file_serialization.product_management_binary.model.model.Product;
import ss17_io_binary_file_serialization.product_management_binary.model.service.IProductService;
import ss17_io_binary_file_serialization.product_management_binary.model.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args)  {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----Product Manager-------");
            System.out.println("1. Thêm sản phẩm");;
            System.out.println("2. Lấy danh sách sản phẩm");
            System.out.println("3. Tìm sản phẩm theo tên");
            System.out.println("4. Thoát lựa chọn");
            System.out.print("Hãy nhập lựa chọn: ");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Hãy nhập số để lựa chọn dịch vụ");
            }
            switch (choice) {
                case 1:
                    System.out.print("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập hãng xản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(id, name, manufacturer, price);
                    productService.add(product);
                    break;
                case 2:
                    productService.display();
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
