package ex;

public class Product {
    private String name;
    private double price;

    private int stock;



    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock(){
        return stock;
    }

    public void printInfo() {
        System.out.println("[상품이름]: " + name + "[가격]: " + price + "[재고수량]: " + stock);
    }


}
