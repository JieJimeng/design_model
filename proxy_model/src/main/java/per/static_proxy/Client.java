package per.static_proxy;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/19 10:20
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Star p = new ProxyStar();
        p.sing();
        p.bookticket();
        p.confer();p.signContract();

    }

}
