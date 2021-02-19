package per.static_proxy;

/**
 * @Description 代理角色
 * @Author jie jimeng
 * @Date 2021/2/19 10:11
 * @Version 1.0
 **/
public class ProxyStar implements Star {
    Star star=new RealStar();


    @Override
    public void confer() {
        System.out.println("代理面谈");
    }

    @Override
    public void signContract() {
        System.out.println("代理签约");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void bookticket() {
        System.out.println("代理订票");
    }
}
