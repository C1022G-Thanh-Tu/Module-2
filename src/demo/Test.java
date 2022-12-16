package demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Product> productsArr = new ArrayList<>();
        Product product1 = new Product(2,1000,"a");
        Product product2 = new Product(1,2000,"b");
        Product product3 = new Product(3,3000,"c");
        productsArr.add(product1);
        productsArr.add(product2);
        productsArr.add(product3);
//        Collections.sort(productsArr);
//        for (Product product : productsArr) {
//            System.out.println(product);
//        }
        for (int i =0; i< productsArr.size(); i++) {
            if (productsArr.get(i).getId() == 2) {
                productsArr.remove(productsArr.get(i));
            }
        }
        System.out.println(productsArr);
    }
}
