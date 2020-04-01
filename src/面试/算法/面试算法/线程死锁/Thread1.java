package 面试.算法.面试算法.线程死锁;

public class Thread1 implements Runnable
{

    @Override
    public void run()
    {
        try
        {
            System.out.println("Thread1 is running");
            synchronized (ThreadResource.resource1)
            {
                System.out.println("Thread1 lock resource1");
                Thread.sleep(2000);//休眠2s等待线程2锁定资源2
                synchronized (ThreadResource.resource2)
                {
                    System.out.println("Thread1 lock resource2");
                }
                System.out.println("Thread1 release resource2");
            }
            System.out.println("Thread1 release resource1");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Thread1 is stop");
    }

}