package indi.solomon.thread;

/**
 * Created by 刘大磊 on 2016/10/18 11:08.
 */
public class MainThread extends Thread{

    private CheckOrder checkOrder;

    private String name;

    public static void main(String[] args)
    {
        CheckOrder checkOrder1=new CheckOrder();
//        checkOrder1.checkOrder("火腿肠");
        CheckOrder checkOrder2=new CheckOrder();
//        checkOrder1.checkOrder("苹果");
//        checkOrder1.checkOrder("火腿肠");
        MainThread mainThread1=new MainThread();
        mainThread1.checkOrder=checkOrder1;
        mainThread1.name="火腿肠";


        MainThread mainThread2=new MainThread();
        mainThread2.checkOrder=checkOrder1;
        mainThread2.name="火腿肠";


        MainThread mainThread3=new MainThread();
        mainThread3.checkOrder=checkOrder2;
        mainThread3.name="火腿肠";


        mainThread1.start();
        mainThread2.start();
        mainThread3.start();
    }

    @Override
    public void run() {
        checkOrder.checkOrder(name);
    }
}
