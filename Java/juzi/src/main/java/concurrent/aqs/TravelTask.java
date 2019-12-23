package concurrent.aqs;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lyh
 * @date 2019/10/18 0018
 **/
public class TravelTask {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Guide());
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Travel(cyclicBarrier, "张三"));
        executorService.execute(new Travel(cyclicBarrier, "李四"));
        executorService.execute(new Travel(cyclicBarrier, "王五"));
        executorService.shutdown();
    }
}
