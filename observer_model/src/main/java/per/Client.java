package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 10:13
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteSubject sub = new ConcreteSubject();
        ObserverA a = new ObserverA();
        ObserverA b = new ObserverA();
        ObserverA c = new ObserverA();

        sub.addObserver(a);
        sub.addObserver(b);
        sub.addObserver(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sub.setState(1000);
        System.out.println(a.myState);
        System.out.println(b.myState);
        System.out.println(c.myState);

    }

}
