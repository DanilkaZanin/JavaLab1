package org.example;

import java.util.Iterator;

/**
 * Класс MyList реализует односвязный список и все его основные методы
 *
 * @param <T> тип данных использующийся при работе с классом
 *
 * @author danila */
public class MyList<T> implements Iterable<T>{

    private Node head;
    private int size;

    private class Node <T>{
        private T value;
        private Node next;

        public Node(T t){
            value = t;
            next = null;
        }
    }

    /**
     * Конструктором по умолчанию
     *
     * @example <p>Пример искользования конструктора:
     *      <pre>{@code
     *           MyList list = new MyList();
     *      }</pre>
     * */
    public MyList(){
        head = null;
        size = 0;
    }

    /**
     * Конструктором с одним параметром
     *
     * @param t - принимает любой тип данных
     *
     * @example <p>Пример искользования конструктора:
     *      <pre>{@code
     *           MyList list = new MyList(1);
     *      }</pre>
     * */
    public MyList(T t){
        head = new Node<>(t);
        size = 1;
    }
    public MyList(T[] t){
        for(T i: t){
            add(i);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<T> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = (T) current.value;
            current = current.next;
            return value;
        }
    }

    public void add(T t){
        if(head!= null){
            Node h1 = head;

            while(h1.next != null){
                h1 = h1.next;
            }

            h1.next = new Node<>(t);
        }
        else{
            head = new Node<>(t);
        }
        size += 1;
    }

    public void delete(T t){
        int count = 0;
        int countOfDeleted = 0;
        if(head != null){
            Node current = head;
            Node prev = null;

            do{
                if(current.value != t){
                    prev = current;
                    current = current.next;
                }
                else {
                    if(prev != null) {
                        prev.next = current.next;
                        current = current.next;
                    }
                    else{
                        head = head.next;
                    }

                    countOfDeleted += 1;
                }
            }while(current != null);

            if(countOfDeleted != 0){
                System.out.println("Удалено " + countOfDeleted + " переменных!");
            }else{
                System.out.println("В списке таких значений нету");
            }
        }
        else{
            System.err.println("Список пуст!");
        }
    }

    public void print(){

        Node h1 = head;

        do{
            System.out.print(h1.value + " ");
            h1 = h1.next;
        }while (h1 != null);

        System.out.println();
    }

    public int size(){
        return size;
    }

}
