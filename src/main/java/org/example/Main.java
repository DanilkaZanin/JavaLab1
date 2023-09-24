package org.example;



public class Main {
    public static void main(String[] args) {
        Integer[] i = {1,2,3,4,5,6,7,8};

        MyList<Integer> list = new MyList<>(i);

        list.print();

        list.remove(12);

        list.print();

    }

}