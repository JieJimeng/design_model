package per;

/**
 * @Description 懒汉式
 * @Author jie jimeng
 * @Date 2021/2/5 17:38
 * @Version 1.0
 **/
public class Single_02 {
    private  static Single_02 instance = null;

    private Single_02() {
    }

    public static synchronized Single_02 getInstance() {
        if(instance==null){
            instance=new Single_02();
        }
        return instance;
    }
}
