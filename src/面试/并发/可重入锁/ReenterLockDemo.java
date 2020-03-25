package 面试.并发.可重入锁;
class phone{
    public synchronized  void sendsMs() throws  Exception{
        System.out.println(Thread.currentThread().getId()+"\t invoked sendSMS()");
        sendEmail();
    }
    public synchronized void sendEmail() throws Exception{
        System.out.println(Thread.currentThread().getId()+"\t invoked sendEmail*****");
    }
}

public class ReenterLockDemo {
    public static void main(String[] args) {
        phone phone= new phone();
        new Thread(()->{
            try {
                phone.sendsMs();
            }catch(Exception e){
                System.out.println(e);
            }
        },"t1").start();
        new Thread(()->{
            try {
                phone.sendsMs();
            }catch(Exception e){
                System.out.println(e);
            }
        },"t2").start();
    }
}
