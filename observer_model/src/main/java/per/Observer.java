package per;



/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 9:51
 * @Version 1.0
 **/
public interface Observer {
    void update(Subject subject);

}

class ObserverA implements Observer {

    protected int myState;

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Subject subject) {
        this.setMyState(((ConcreteSubject)subject).state);
    }
}
