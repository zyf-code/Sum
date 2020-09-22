package cn.tedu;

public class Ru_nnale_test {
    public static void main(String[] args) {
        MyRunnable tgat = new MyRunnable();

        Thread t1 = new Thread(tgat);
        

        tgat.run();
        t1.start();

        Thread t2 =new Thread();

        t2.start();

    }
}
