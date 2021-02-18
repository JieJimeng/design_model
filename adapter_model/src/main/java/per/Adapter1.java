package per;

/**
 * @Description 组合方式
 * @Author jie jimeng
 * @Date 2021/2/18 17:51
 * @Version 1.0
 **/
public class Adapter1 implements Target {

    private Adaptee a;
    @Override
    public void handleRes() {
        a.request();
    }

    public Adapter1(Adaptee a) {
        this.a = a;
    }
}
