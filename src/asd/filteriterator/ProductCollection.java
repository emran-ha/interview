package asd.filteriterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class ProductCollection {
    List<Product> list = new ArrayList<>();
    void add(Product product){
        list.add(product);
    }
    Iterator<Product> filteredIterator(Predicate<Product> predicate){
        return new FilterIterator<>(list, predicate);
    }
}
