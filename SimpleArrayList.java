package lesson7.simplearraylist;

import java.util.Iterator;

public class SimpleArrayList implements SimpleList, Iterable{

    Object[] arr;
    private static int currNum;

    public SimpleArrayList() {
        arr = new Object[10];
        currNum = 0;
    }
//    (oldCapacity * 3) / 2 + 1

    @Override
    public void add(Object object) {

        if (arr.length <= currNum + 1) {
            increaseCapacity();
        }
        currNum++;
        arr[currNum] = object;
    }

    public void increaseCapacity() {

        int newCapacity = (arr.length * 3) / 2 + 1;
        Object[] newArr = new Object[newCapacity];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    @Override
    public boolean contains(Object object) {

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(Object object) {

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals(object)) {
                System.arraycopy(arr, i+1, arr, i, arr.length - i - 1);
                currNum--;
                break;
            }
        }
    }

    @Override
    public int size() {

        return currNum;
    }

    @Override
    public Iterator<Object> iterator() {
        return new SALIterator();
    }

    private class SALIterator implements Iterator {

        private int curr;

        public SALIterator() {
            curr = 0;
        }

        @Override
        public boolean hasNext() {

            if (arr[curr + 1] != null) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (curr == 0 && arr[0] != null) {
                return arr[0];
            }
            else if (hasNext()) {
                curr++;
                return arr[curr];
            }
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
