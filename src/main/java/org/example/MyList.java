package org.example;

import java.sql.SQLOutput;

public class MyList<T> {

    private Node head;
    private int size;

    private class Node <T>{
        public T value;
        public Node next;

        public Node(T t){
            value = t;
            next = null;
        }
    }

    public MyList(){
        head = null;
        size = 0;
    }

    public MyList(T t){
        head = new Node<>(t);
        size = 1;
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
