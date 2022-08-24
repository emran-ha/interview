package asd.filteriterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class FilterIterator<T> implements Iterator<T> {
    private final List<T> list;
    private Predicate<T> predicate;
    private int position;
    FilterIterator(List<T> list, Predicate<T> predicate){
        this.list = list;
        this.predicate = predicate;
        this.position = 0;
    }
    @Override
    public boolean hasNext() {
        int temp =  position;
        while (temp < list.size()){
            T t = list.get(temp);
            if(predicate.test(t)){
                return true;
            }else {
                temp++;
            }
        }
        return false;
    }

    @Override
    public T next() {
        int temp = position;
        while (temp < list.size()){
            T t = list.get(temp);
            if(predicate.test(t)){
                position = temp + 1;
                return t;
            }else{
                temp++;
            }
        }
        return null;
    }
}
