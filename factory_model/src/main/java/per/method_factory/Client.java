package per.method_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 15:01
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Car c1 = new AudiFactory().create();
        Car c2 = new BydFactory().create();

        c1.run();
        c2.run();
    }
}
