package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 14:18
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Leader director = new Director("张三");
        Leader manager = new Manager("李四");
        Leader boss = new Boss("王五");
        director.setNextLeader(manager);
        manager.setNextLeader(boss);


        LeaveRequest lr = new LeaveRequest("二狗子",25,"相亲");
        director.handleResquest(lr);
    }

}
