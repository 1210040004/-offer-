package 面试.jvm.Synchronized关键字;

import java.lang.ref.SoftReference;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

class Source {
    //默认开启，进行生产消费
    private  volatile boolean FLAG =true;
    private AtomicInteger atomicInteger= new AtomicInteger();

    BlockingQueue<String> blockingQueue= null;

    public Source(BlockingQueue<String> blockingQueue){
        this.blockingQueue= blockingQueue;
    }



}
public class ProducerConsumerBlockQueue {

}
