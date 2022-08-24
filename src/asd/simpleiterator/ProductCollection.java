package asd.simpleiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ProductCollection {
    List<Product> list = new ArrayList<>();
    void addProduct(Product product){
        list.add(product);
    }
    Iterator<Product> reverseIterator(){
        return new ReverseIterator<>(list);
    }
}
