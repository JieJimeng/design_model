package per1;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 10:40
 * @Version 1.0
 **/
public class ObserverA implements Observer {

    protected int myState;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("arg: "+(int)arg);
        myState = ((ConcreteSubject)o).getState();
    }
}
