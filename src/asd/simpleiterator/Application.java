package asd.simpleiterator;

import java.util.Iterator;

class Application {
    public static void main(String[] args) {
        ProductCollection productCollection = new ProductCollection();
        productCollection.addProduct(new Product("fred3", "Iphone", 250));
        productCollection.addProduct(new Product("gh34s", "Samsung", 800));
        productCollection.addProduct(new Product("3afad", "TV", 1260));
        productCollection.addProduct(new Product("34fd", "Bicycle", 1400));
        Iterator<Product> iterator = productCollection.reverseIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
