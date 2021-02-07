package per.abstract_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 15:43
 * @Version 1.0
 **/
public interface Engine {
    void run();
    void start();
}


class LuxuryEngine implements Engine {

    @Override
    public void run() {

        System.out.println("转得快！");
    }

    @Override
    public void start() {
        System.out.println("启动快！可以自动启停！");

    }
}



class LowEngine implements Engine {

    @Override
    public void run() {

        System.out.println("转得慢！");
    }

    @Override
    public void start() {
        System.out.println("启动慢！可不以自动启停！");

    }
}
