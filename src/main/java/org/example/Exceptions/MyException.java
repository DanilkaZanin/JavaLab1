package org.example.Exceptions;

public class MyException extends Exception{
    private final String message;
    public MyException(){
        super();
        message = null;
    }
    public MyException(String message){
        this.message = message;
    }

    public void printMessage(){
        if(message == null){
            System.err.println("Сообщений нету, просто ошибка, а мог бы прописать при вызове конструктора!");
        }
        else  {
            System.err.println(message);
        }
    }
}
