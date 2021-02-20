package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 17:17
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Strategy ocm = new NewCusLittle();
        Context context = new Context(ocm);
        context.printPrice(1000);
    }
}
