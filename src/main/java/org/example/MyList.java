package org.example;

public class MyList<T> {

    private Node head;
    private Node tail;

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
        tail = null;
    }

    public void Mylist(T t){
        head = new Node<>(t);
        tail = null;
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
            tail = null;
        }
    }

    public void print(){

        Node h1 = head;

        while(h1.next != null){
            System.out.print(h1.value + " ");
            h1 = h1.next;
        }
        System.out.print(h1.value + " ");
    }
}
