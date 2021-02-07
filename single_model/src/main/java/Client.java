import per.Single_01;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/5 18:02
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Single_01 s1 = Single_01.getInstance();
        Single_01 s2 = Single_01.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
