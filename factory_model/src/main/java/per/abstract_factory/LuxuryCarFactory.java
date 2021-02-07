package per.abstract_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 16:02
 * @Version 1.0
 **/
public class LuxuryCarFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
