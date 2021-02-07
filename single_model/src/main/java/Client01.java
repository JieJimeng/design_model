import per.Single_03;

import java.util.concurrent.CountDownLatch;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 11:01
 * @Version 1.0
 **/
public class Client01 {
    public static void main(String[] args) throws Exception {

        long start =System.currentTimeMillis();
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int m = 0; m < 10; m++) {
            new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 100000; i++) {
                        Object o = Single_03.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }



        countDownLatch.await();
        long end =System.currentTimeMillis();
        System.out.println("总耗时："+(end-start));
    }
}
