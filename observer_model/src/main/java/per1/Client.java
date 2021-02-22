package per1;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 10:45
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ObserverA a = new ObserverA();
        ObserverA b = new ObserverA();
        ObserverA c = new ObserverA();

        concreteSubject.addObserver(a);
        concreteSubject.addObserver(b);
        concreteSubject.addObserver(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        concreteSubject.setState(1000);
        System.out.println(a.myState);
        System.out.println(b.myState);
        System.out.println(c.myState);
    }

}
