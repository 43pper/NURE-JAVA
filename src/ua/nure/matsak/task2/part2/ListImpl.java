package ua.nure.matsak.task2.part2;

import java.util.Iterator;

public class ListImpl<E> implements List<E>{
    Node<E> head;
    Node<E> currentNode;

    public ListImpl(){
        this.head = null;
        this.currentNode = null;
    }

    @Override
    public void clear() {
        head = null;
        currentNode = null;
    }

    @Override
    public int size() {
        IteratorImpl<E> iterator = new IteratorImpl<>();
        int counter = 0;
        while (iterator.hasNext()){
            counter++;
        }
        return counter;
    }

    @Override
    public Iterator<E> iterator() {
        return new IteratorImpl<E>();
    }

    @Override
    public void addFirst(E element) {
        if (head == null) {
            head = new Node(element);
            currentNode = head;
        }
        else{
            Node<E> newHead = new Node<>(element);
            newHead.setNext(head);
            head = newHead;
        }
    }

    @Override
    public void addLast(E element) {
        if (head == null) {
            head = new Node<>(element);
            currentNode = head;
        }
        else{
            Node<E> newLast = new Node<>(element);
            currentNode.setNext(newLast);
            currentNode = newLast;
        }
    }

    @Override
    public void removeFirst() {
        if (head != null){
            head = head.getNext();
        }
    }

    @Override
    public void removeLast() {
        Node<E> pointer = head;
        if (head == null || pointer.getNext() == null) {
            head = null;
            return;
        }
        while (pointer.getNext().getNext() != null){
            pointer = pointer.getNext();
        }
        pointer.getNext().setNext(null);
    }

    @Override
    public E getFirst() {
        if (head == null) return null;
        return head.data;
    }

    @Override
    public E getLast() {
        if (currentNode == null) return null;
        return currentNode.data;
    }

    @Override
    public E search(E element) {
        Node<E> pointer = head;
        if (pointer == null) return null;
        if (pointer.getNext() == null && !pointer.getNext().getData().equals(element)) return null;
        while (pointer.getNext() != null && pointer.getNext().getNext() != null){
            if (pointer.getData().equals(element)) return pointer.getData();
            pointer = pointer.getNext();
        }
        return null;
    }

    @Override
    public boolean remove(E element) {
        if (search(element) == null) return false;
        Node<E> pointer = head;
        while (pointer.getNext().getNext() != null){
            if (pointer.getNext().getData().equals(element)){
                pointer.setNext(pointer.getNext().getNext());
                return true;
            }
            pointer = pointer.getNext();
        }
        return false;
    }

    @Override
    public void print() {
        System.out.print("[ ");
        while (iterator().hasNext()){
            System.out.print(iterator().next());
        }
        System.out.println("");
    }

    private static class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data){
            setData(data);
            setNext(null);
        }

        public void setData(E data) {
            this.data = data;
        }

        public void setNext(Node<E> next){
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }

    static class IteratorImpl<E> implements Iterator{
        Node pointer;

        @Override
        public boolean hasNext() {
            if (pointer != null && pointer.getNext() != null) return true;
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                pointer = pointer.getNext();
                return pointer;
            }
            return null;
        }
    }
}
