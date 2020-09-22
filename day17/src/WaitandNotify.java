public class  WaitandNotify {
  public static void main(String[] args) {
    Object o=new Object();
//    这是一个顾客线程
    new Thread(){
      @Override
      public void run() {
      while (true){
        synchronized (o){
          System.out.println("告知老板我要的包子的种类和数量");
//        调用方法进入无限等待状态
          try {
            o.wait();
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
//        唤醒之后执行的代码
          System.out.println("包子已经做好了开吃");

        }
      }
      }
    }.start();
//    创建一个老板线程
    new Thread(){
      @Override
      public void run() {
//        花5秒做包子
        try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        synchronized (o){
          System.out.println("老板5秒钟之后做好包子，告知顾客，可以吃包子");
          o.notify();
        }
      }
    }.start();
  }
}
