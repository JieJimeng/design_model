package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/19 16:49
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Computer l = new Labtop(new Lenovo());
        l.sale();
    }
}
