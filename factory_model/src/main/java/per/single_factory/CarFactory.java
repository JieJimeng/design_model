package per.single_factory;

/**
 * @Description 简单工厂
 * @Author jie jimeng
 * @Date 2021/2/7 14:00
 * @Version 1.0
 **/
public class CarFactory {
    public  static Car createCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("比亚迪".equals(type)) {
            return new Byd();
        } else {
            return null;
        }
    }
}
