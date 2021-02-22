package per;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 9:53
 * @Version 1.0
 **/
public class Subject {
    protected List<Observer> list = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void delObserver(Observer observer) {
        list.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer obj : list) {
            obj.update(this);
        }
    }

}

class ConcreteSubject extends Subject {
    protected int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObserver();
    }
}