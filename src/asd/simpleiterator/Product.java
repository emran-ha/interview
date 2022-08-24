package asd.simpleiterator;

class Product {
    private String number;
    private String name;
    private double price;
    Product(String number, String name, double price){
        this.number = number;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return number+" "+name+" "+price;
    }
}
