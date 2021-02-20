package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 16:04
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Mediator manager = new Manager();
        Department development = new Development(manager);
        //Department market = new Market(manager);
        //Department finacial = new Finacial(manager);
        development.selfAction();
        development.outAction();
    }
}
