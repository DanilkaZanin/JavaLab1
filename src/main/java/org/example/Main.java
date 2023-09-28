package org.example;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 2};

        MyList<Integer> list = new MyList<>();

        list.removeType(2);

        list.print();

    }
}
