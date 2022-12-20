package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.repository;

import ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model.ArrayListProduct;

import java.util.*;

public class ArrayListProductRepository implements IArrayListProductRepository {
    public static List<ArrayListProduct> productList = new ArrayList<>();

    static {
        ArrayListProduct product1 = new ArrayListProduct(1, "Máy ảnh", 1000000);
        ArrayListProduct product2 = new ArrayListProduct(2, "Điện thoại", 1200000);
        ArrayListProduct product3 = new ArrayListProduct(3, "Laptop", 3000000);
        ArrayListProduct product4 = new ArrayListProduct(4, "Bàn phím", 1500000);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
    }

    @Override
    public void addProduct(ArrayListProduct product) {
        productList.add(product);
    }

    @Override
    public ArrayListProduct updateProduct(ArrayListProduct product) {
        for (int i = 0; i<productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                return productList.set(i, product);
            }
        }
        return null;
    }

    @Override
    public ArrayListProduct findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void removeProduct(int id) {
        for (int i = 0; i<productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(productList.get(i));
                break;
            } else {
                System.out.println("Không tìm thấy sản phẩm có id tương ứng");
                break;
            }
        }
    }

    @Override
    public void listProduct() {
        for (ArrayListProduct product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct(String name) {
        for (int i = 0; i<productList.size(); i++) {
            if (productList.get(i).getName().contains(name)) {
                System.out.println(productList.get(i));
                break;
            } else {
                System.out.println("Không tìm thấy sản phẩm có tên vừa nhập");
                break;
            }
        }
    }

    @Override
    public void sortAscendingOrder() {
        Collections.sort(productList);
    }

    @Override
    public void sortDescendingOrder() {
        Collections.sort(productList);
        Collections.reverse(productList);
    }
}