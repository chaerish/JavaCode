import java.util.ArrayList;
import java.util.Iterator;

public class ObjectDynamicArray<E> implements Iterable<E> {
    private ArrayList<E> arrayList;
    ObjectDynamicArray(){
        arrayList= new ArrayList<>();
    }
    @Override
    public Iterator<E> iterator() {
        return new ObjectDyanmicArrayIterator();
    }
    public E get(int idx){
        if(idx<0 || idx>arrayList.size()-1){
            return null;
        }
        return arrayList.get(idx);
    }
    class ObjectDyanmicArrayIterator implements Iterator<E>{
        int idx;
        ObjectDyanmicArrayIterator(){
            idx=0; // 0으로 초기화
        }
        @Override
        public boolean hasNext() { // 더 요소가 있는지,
            return idx > arrayList.size();
        }

        @Override
        public E next() {
            idx ++;
            return (E) arrayList.get(idx-1);
        }
    }
}

