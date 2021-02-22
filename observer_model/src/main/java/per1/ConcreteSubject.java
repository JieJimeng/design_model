package per1;

import java.util.Observable;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 10:34
 * @Version 1.0
 **/
public class ConcreteSubject extends Observable {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        setChanged();
        notifyObservers(this.state);
    }
}
