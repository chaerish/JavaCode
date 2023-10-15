import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class MyStack<E> implements Iterable<E> {
    private ArrayList<E> data;
    public MyStack(){
        data=new ArrayList<E>();
    }
    class MyStackIterator implements Iterator<E>{
        int idx;
        public MyStackIterator(){
            idx=0;
        }
        @Override
        public boolean hasNext() { //다음 요소가 있는가
            return idx<data.size(); //true
        }

        @Override
        public E next() { //다음 요소 반환
            idx++;
            return data.get(idx-1);//idx++해주고 그 전 요소 반환
        }
    }
    public void push(E e){//스택에 데이터 추가
        data.add(e);
    }
    public E pop(){ //스택 가장 위의 데이터 반환(=가장 최근에 삽입한거)
        E e= data.get(data.size()-1);
        data.remove(data.size()-1);
        return e;
    }
    public boolean isEmpty(){ //비어있느냐
        return data.isEmpty();
    }
    @Override
    public Iterator<E> iterator() { //나를 반환해주기(for-each 사용가능)
        return new MyStackIterator();
    }
}
