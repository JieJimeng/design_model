package per.method_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 14:50
 * @Version 1.0
 **/
public class AudiFactory implements CarFactory {
    @Override
    public Car create() {
        return new Audi();
    }
}
