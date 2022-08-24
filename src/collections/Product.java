package collections;

class Product {
    String name;
    double price;
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return name + " " +price;
    }
    public double getPrice() {
        return price;
    }
}
