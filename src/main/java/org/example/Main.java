package org.example;



public class Main {
    public static void main(String[] args) {
       MyList<Integer> list = new MyList<>();

       for(int i = 0; i < 10; i++){
           list.add(i);
       }

       list.print();
    }

}