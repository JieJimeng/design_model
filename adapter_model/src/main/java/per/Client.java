package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/18 17:49
 * @Version 1.0
 **/
public class Client {
    public void test(Target target) {
        target.handleRes();
    }

    public static void main(String[] args) {
        Client c = new Client();

        // Target adapter = new Adapter();  //继承方式

        //组合方式
        Adaptee a = new Adaptee();
        Adapter1 adapter = new Adapter1(a);

        c.test(adapter);
    }
}
