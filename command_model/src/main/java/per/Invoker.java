package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 17:53
 * @Version 1.0
 **/
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        command.excute();
    }
}
