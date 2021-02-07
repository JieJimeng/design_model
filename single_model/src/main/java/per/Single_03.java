package per;

/**
 * @Description 双重监测锁式（不推荐）
 * @Author jie jimeng
 * @Date 2021/2/5 17:46
 * @Version 1.0
 **/
public class Single_03 {
    private static Single_03 instance = null;

    public Single_03() {
    }

    public static Single_03 getInstance() {
        if (instance == null) {
            Single_03 sc;
            synchronized (Single_03.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (Single_03.class) {
                        if (sc == null) {
                            sc=new Single_03();
                        }
                    }
                    instance=sc;
                }
            }
        }
        return instance;
    }
}
