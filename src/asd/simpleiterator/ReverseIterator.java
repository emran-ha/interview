package asd.simpleiterator;

import java.util.Iterator;
import java.util.List;

class ReverseIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int position;
    ReverseIterator(List<T> list) {
        this.list = list;
        this.position = list.size() - 1;
    }

    public Iterator<T> iterator(){
        return this;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public T next() {
        return list.get(position--);
    }
}
