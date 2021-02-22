package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 17:43
 * @Version 1.0
 **/
public interface Command {
    void excute();
}




class ConcreteCommand implements Command {

    private Receive receive;

    public ConcreteCommand(Receive receive) {
        this.receive = receive;
    }

    @Override
    public void excute() {
        receive.action();
    }
}
