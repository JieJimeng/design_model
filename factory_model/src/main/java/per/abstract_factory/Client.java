package per.abstract_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 16:10
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.run();
        e.start();
        Seat s = factory.createSeat();
        s.massage();
        Tyre t = factory.createTyre();
        t.revole();
    }

}
