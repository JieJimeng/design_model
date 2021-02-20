package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 17:13
 * @Version 1.0
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s) {
        strategy.getPrice(s);
    }
}
