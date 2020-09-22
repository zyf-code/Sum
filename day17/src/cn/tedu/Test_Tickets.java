package cn.tedu;

public class Test_Tickets {
    public static void main(String[] args) {


//第一种方法的实现
//        MyTickets t = new MyTickets();
//        t.setName("窗口一");
//        t.start();
//        MyTickets t2 = new MyTickets();
//        t2.setName("窗口二");
//        t2.start();
//
//        MyTickets t3 = new MyTickets();
//        t3.setName("窗口三");
//        t3.start();
//
//        MyTickets t4 = new MyTickets();
//        t4.setName("窗口四");
//        t4.start();
//        MyTickets2 tc = new MyTickets2();
//        Thread t = new Thread(tc,"窗口一");
//        t.setName("窗口一");
//        t.start();
//        Thread t2 = new Thread(tc);
//        t2.setName("窗口二");
//        t2.start();
//        Thread t3 = new Thread(tc);
//        t3.setName("窗口三");
//        t3.start();
//        Thread t4= new Thread(tc);
//        t4.setName("窗口四");
//        t4.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"我是匿名内部类的线程");

            }
        }.start();


         new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"我是接口匿名内部类的线程");
            }
        }).start();




    }
}
//第一种方法的定义
//继承的Thread接口
//class MyTickets extends Thread{
//     static  int tickets=1000;
//
//    @Override
//    public void run() {
////死循环必须要有出口
//
//        while (true) {
//            if (tickets > 0) {
////                想要测试多线程编程中数据到底有没有编程隐患
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //相当于用thread获取当前的线程的名称
//                System.out.println(super.getName()+"------>"+tickets--);
//            } else {
//                break;
//            }
//        }
//    }
//}

//定义在接口里面只有一个接口，实体类只创建了一次对象
class MyTickets2 implements Runnable{
    int tickets=1000;
    @Override
    public void run() {
        while (true){

            if (tickets>0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"--------->"+tickets--);
            }else {
                break;
            }
        }
    }
}
