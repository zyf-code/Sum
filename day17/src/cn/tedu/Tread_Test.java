package cn.tedu;

public class Tread_Test {
    public static void main(String[] args) {
        My_Thread t = new My_Thread();
            t.setName("hjg");
        t.run();
        t.start();

    }
}
