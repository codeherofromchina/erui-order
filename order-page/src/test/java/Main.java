import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/18 上午9:51
 */
public class Main {
    public static int abc = 1;

    static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);
    public static void main(String[] args) {
        R r = new R();
        Thread thread = new Thread(r);

        thread.start();

        fixedThreadPool.execute(thread);
        fixedThreadPool.execute(thread);
        fixedThreadPool.execute(thread);
        fixedThreadPool.execute(thread);
        fixedThreadPool.execute(thread);
    }


    private static class R implements Runnable {

        @Override
        public void run() {
            System.out.println(abc++);
        }
    }
}
