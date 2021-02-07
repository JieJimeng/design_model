package per.abstract_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 15:52
 * @Version 1.0
 **/
public interface Seat {
    public void massage();
}

class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("可以自动按摩！");
    }
}

class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不可以自动按摩！");
    }
}
