package asd.filteriterator;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Application {
    public static void main(String[] args) {
        ProductCollection productCollection =  new ProductCollection();
        productCollection.add(new Product("12", "Iphone", 1280, true));
        productCollection.add(new Product("13", "Car", 25000, false));
        productCollection.add(new Product("14", "HeadPhone", 100, false));
        productCollection.add(new Product("15", "card", 12, true));
        Iterator<Product> filterIterator = productCollection.filteredIterator(product -> product.isAvailable());
        while (filterIterator.hasNext()){
            System.out.println(filterIterator.next());
        }

        Iterator<Product> price = productCollection.filteredIterator(product -> product.getPrice() > 1000);
        while (price.hasNext()){
            System.out.println(price.next());
        }
    }
}
