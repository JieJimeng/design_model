package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 10:30
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ICar car=new Car();
        car.move();
        System.out.println("_____________________");
        ICar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("_____________________");
        ICar swimCar = new SwimCar(car);
        swimCar.move();
        System.out.println("_____________________");
        ICar swimCar1 = new SwimCar(flyCar);
        swimCar1.move();
    }
}
