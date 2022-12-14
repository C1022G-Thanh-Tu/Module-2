package ss12_java_collection_framework.practice_arrayList_linkedList.arrayList.model.model;

public class ArrayListProduct implements Comparable<ArrayListProduct> {
    private int id;
    private int price;
    private String name;

    public ArrayListProduct() {

    }

    public ArrayListProduct(int id, String name, int price) {
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
    public int compareTo(ArrayListProduct o) {
        return this.price - o.getPrice();
    }
}