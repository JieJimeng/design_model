package per.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/19 10:52
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        StarHandler sh = new StarHandler();
        Star starProxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, sh);

        starProxy.confer();
        starProxy.sing();
    }
}
