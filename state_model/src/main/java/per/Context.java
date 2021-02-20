package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 17:57
 * @Version 1.0
 **/
public class Context {
    State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.handle();
    }
}
