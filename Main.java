package Synchronized;

public class Main {

    public static void main(String[] args) throws InterruptedException  {

        Number x = new Number(2);
        Number y = new Number(3);
        MyThread t1 = new MyThread(x, y);
        MyThread t2 = new MyThread(y, x);
        t1.start();
        //t1.join();
        t2.start();

    }
}