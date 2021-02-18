package per;

/**
 * @Description 继承方式
 * @Author jie jimeng
 * @Date 2021/2/18 17:51
 * @Version 1.0
 **/
public class Adapter extends Adaptee implements Target {

    @Override
    public void handleRes() {
        super.request();
    }
}
