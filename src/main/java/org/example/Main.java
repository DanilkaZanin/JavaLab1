package org.example;



public class Main {
    public static void main(String[] args) {
       MyList<Integer> list = new MyList<>(1);

       for(int i = 0; i < 10; i++){
           list.add(i);
       }

       list.add(5);

       list.print();

       list.delete(12);

       list.print();
    }

}