package per;

/**
 * @Description 饿汉式
 * @Author jie jimeng
 * @Date 2021/2/5 17:34
 * @Version 1.0
 **/
public class Single_01 {
    private static Single_01 instance = new Single_01();
    private Single_01 (){

    }

    public static Single_01 getInstance() {
        return instance;
    }
}
