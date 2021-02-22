package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 17:58
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Receive receive = new Receive();
        Command command = new ConcreteCommand(receive);
        Invoker invoker = new Invoker(command);

        invoker.call();
    }
}
