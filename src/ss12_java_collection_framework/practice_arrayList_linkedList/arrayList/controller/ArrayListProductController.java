package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.controller;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.service.IArrayListProductService;
import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.service.ArrayListProductService;

import java.util.Scanner;

public class ArrayListProductController {
    public static void main(String[] args) {
        IArrayListProductService productService = new ArrayListProductService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----Product Manager-------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Điều chỉnh sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Lấy danh sách sản phẩm");
            System.out.println("5. Tìm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo thứ tự giá tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo thứ tự giá giảm dần");
            System.out.println("8. Thoát lựa chọn");
            System.out.print("Hãy chọn một dịch vụ: ");
            int select = Integer.parseInt(scanner.nextLine());
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
                    ArrayListProduct product = productService.findById(idNeedFixed);
                    if (product != null) {
                        System.out.print("Nhập giá mới: ");
                        int newPrice = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nhập tên sản phẩm mới: ");
                        String newName = scanner.nextLine();
                        product.setName(newName);
                        product.setPrice(newPrice);
                        productService.updateProduct(product);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm có id tương ứng");
                    }
                    break;
                case 3:
                    System.out.print("Nhập id sản phẩm cần xóa: ");
                    id = Integer.parseInt(scanner.nextLine());
                    ArrayListProduct product1 = productService.findById(id);
                    if (product1!=null) {
                        System.out.println(productService.removeProduct(product1));
                    } else {
                        System.out.println("Không tìm thấy id tương ứng");
                    }
                    break;
                case 4:
                    productService.listProduct();
                    break;
                case 5:
                    System.out.print("Nhập tên sản phẩm: ");
                    name = scanner.nextLine();
                    if (productService.searchProduct(name) != null) {
                        System.out.println(productService.searchProduct(name));
                    } else {
                        System.out.println("Không tìm thấy sản phẩm có tên tương ứng");
                    }
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
                default:
                    System.err.println("Hãy lựa chọn dịch vụ có trong menu");
                    break;
            }
        } while (true);
    }
}