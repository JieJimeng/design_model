package per.single_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 13:52
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Car audi = new Audi();
        Car audi1 = new Audi();
        Car byd = new Byd();

        System.out.println(audi);
        System.out.println(audi1);

        audi.run();
        byd.run();
    }
}
