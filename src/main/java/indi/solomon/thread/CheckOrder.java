package indi.solomon.thread;

/**
 * Created by 刘大磊 on 2016/10/18 10:57.
 */
public class CheckOrder {
    private DataBase dataBase=DataBase.getInstance();
    private static final Long sync=-1l;
    public void checkOrder(String name)
    {
        synchronized (sync)
        {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+"开始检查");
            if(dataBase.contains(name))
            {
                System.out.println(name+" 正在处理，请稍等！！");
                return;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+"检查完毕");
            dataBase.add(name);
        }
        System.out.println("doing "+name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void checkName(String name)
    {

    }

}
