package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 17:58
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        State f = new Free();
        Context context = new Context(f);
        context.setState(new Booked());
    }
}
