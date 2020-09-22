package cn.tedu;

public class BaoZiPu extends Thread {
//  需要在成员位置创建一个包子的变量
  private BaoZi bz;

//  使用带参数的构造方法为这个包子变量赋值
  public BaoZiPu(BaoZi bz){
    this.bz=bz;
  }
//设置线程任务生产包子
  @Override
  public void run() {
    super.run();
  }
}
