package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 17:52
 * @Version 1.0
 **/
public interface State {
    void handle();
}

class Free implements State {
    public Free() {
        System.out.println("初始状态：空闲");
    }

    @Override
    public void handle() {
        System.out.println("状态：空闲");
    }
}

class Booked implements State {

    @Override
    public void handle() {
        System.out.println("状态：已预订");
    }
}


class CheckedIn implements State {

    @Override
    public void handle() {
        System.out.println("状态：已入住");
    }
}

