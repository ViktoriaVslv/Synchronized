package Synchronized;

public class MyThread extends Thread {
    private Number ob1;
    private Number ob2;

    public MyThread ( Number num1, Number num2){
       ob1 = num1;
       ob2 = num2;
    }

    @Override
    public void run() {
        synchronized (ob1){
            System.out.println( this.getName() +": "+ ob1.getX());
            System.out.println( this.getName() +": trying to get number: "+ob2.getX());
            synchronized (ob2){
                System.out.println(this.getName() +": I got number: " +ob2.getX());
            }
        }
    }
}
