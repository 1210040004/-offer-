package 面试.算法.面试算法.线程死锁;

public class Thread2 implements Runnable
{

    @Override
    public void run()
    {
        try
        {
            System.out.println("Thread2 is running");
            synchronized (ThreadResource.resource2)
            {
                System.out.println("Thread2 lock resource2");
                Thread.sleep(2000);//休眠2s等待线程1锁定资源1
                synchronized (ThreadResource.resource1)
                {
                    System.out.println("Thread2 lock resource1");
                }
                System.out.println("Thread2 release resource1");
            }
            System.out.println("Thread2 release resource2");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread2 is stop");
    }

}