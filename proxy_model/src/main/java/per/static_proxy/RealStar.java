package per.static_proxy;

/**
 * @Description 真实角色
 * @Author jie jimeng
 * @Date 2021/2/19 10:13
 * @Version 1.0
 **/
public class RealStar implements Star{

    @Override
    public void confer() {
        System.out.println("亲自面谈");
    }

    @Override
    public void signContract() {
        System.out.println("亲自签约");
    }

    @Override
    public void sing() {
        System.out.println("亲自唱歌");
    }

    @Override
    public void bookticket() {
        System.out.println("亲自订票");
    }
}
