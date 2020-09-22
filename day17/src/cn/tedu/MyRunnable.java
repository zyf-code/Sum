package cn.tedu;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
//        打印线程的信息

        for (int i = 0; i <100 ; i++) {

            System.out.println(Thread.currentThread().getName());
        }


    }
}
