package ss12_java_collection_framework.practice_arrayList_linkedList.linkedList.model.model;

public class LinkedListProduct implements Comparable<LinkedListProduct> {
    private int id;
    private int price;
    private String name;

    public LinkedListProduct(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinkedListProduct o) {
        return this.price - o.getPrice();
    }
}