package ua.nure.matsak.task2.part1;

import java.util.Iterator;

public class ArrayImpl<E> implements Array<E>{
    int currentLast = 0;
    Object[] array = new Object[100];

    @Override
    public void clear() {
        for (int i = 0; i < this.size(); i++){
            array[i] = null;
        }
    }

    @Override
    public int size() {
        return currentLast;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int current = 0;
            @Override
            public boolean hasNext() {
                return (current < currentLast);
            }

            @Override
            public E next() {
                if (hasNext()) return (E) array[++current];
                return null;
            }
        };
    }

    @Override
    public void add(E element) {
        if (currentLast == array.length){
            Object[] temp = new Object[array.length * 2];
            for (int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;
        }
        array[currentLast++] = element;
    }

    @Override
    public void set(int index, E element) {
        array[index] = element;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < this.size(); i++){
            if (array[i].equals(element)) return i;
        }
        return -1;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < this.size(); i++){
            array[i-1] = array[i];
        }
        array[currentLast-1] = null;
    }
}
