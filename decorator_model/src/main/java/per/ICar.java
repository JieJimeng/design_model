package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 10:13
 * @Version 1.0
 **/
public interface ICar {
    void move();
}

class Car implements ICar {

    @Override
    public void move() {
        System.out.println("陆地上跑的");
    }
}

class SuperCar implements ICar {
    ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }

    void  fly() {
        System.out.println("天上飞的");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class SwimCar extends SuperCar {
    public SwimCar(ICar car) {
        super(car);
    }

    void  swim() {
        System.out.println("水里游的");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
