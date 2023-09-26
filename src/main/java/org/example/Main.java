package org.example;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8};

        MyList<Integer> list = new MyList<>(a);

        list.print();

        list.add(10,3);

        list.print();
    }
}
