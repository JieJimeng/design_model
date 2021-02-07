package per;

/**
 * @Description 静态内部类式
 * @Author jie jimeng
 * @Date 2021/2/5 17:54
 * @Version 1.0
 **/
public class Single_04 {
    private static class single_04_01 {
        private static final Single_04 instance=new Single_04();
    }

    public Single_04() {
    }

    public static Single_04 getInstance() {
        return single_04_01.instance;
    }
}
