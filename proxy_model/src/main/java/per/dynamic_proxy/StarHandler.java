package per.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/19 10:50
 * @Version 1.0
 **/
public class StarHandler implements InvocationHandler {
    Star star=new RealStar();
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object i = null;
        System.out.println(proxy.getClass().getName());
        if (method.getName().equals("sing")) {
            i = method.invoke(star, args);

        } else if (method.getName().equals("confer")) {
            System.out.println("代理面谈");
        }
        return i;
    }

}
