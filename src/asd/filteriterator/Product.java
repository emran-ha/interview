package asd.filteriterator;

class Product {
    private String number;
    private String name;
    private double price;
    private boolean available;
    Product(String number, String name, double price, boolean available){
        this.number = number;
        this.name = name;
        this.price = price;
        this.available =  available;
    }

    boolean isAvailable(){
        return available;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return number+" "+name+" "+price+" "+available;
    }
}
