package cn.tedu;

public class My_Thread extends Thread{


    @Override
    public void run() {
//        super.run();
        for (int i = 0; i <10 ; i++) {
            System.out.println(super.getName()+i);
        }
    }
}
