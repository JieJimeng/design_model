package per.single_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 13:52
 * @Version 1.0
 **/
public class Client01 {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");
        Car c3 = CarFactory.createCar("奥迪");
        Car c2 = CarFactory.createCar("比亚迪");

        c1.run();
        c2.run();
        c3.run();

        System.out.println(c1);
        System.out.println(c3);
    }
}
