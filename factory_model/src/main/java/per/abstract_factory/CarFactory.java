package per.abstract_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 16:00
 * @Version 1.0
 **/
public interface CarFactory {
    public Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}

