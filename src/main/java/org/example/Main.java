package org.example;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] a = null;

        MyList<Integer> list = new MyList<>(a);
        list.print();

    }
}
