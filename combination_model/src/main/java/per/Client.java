package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/19 18:11
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractFile f2,f3,f4;
        Folder f1=new Folder("收藏夹");
        f2 = new ImageFile("张三");
        f3 = new TextFile("李四");
        f4 = new VideoFile("王五");

        f1.add(f2);
        f1.add(f3);
        f1.add(f4);

        f2.kill();

        f1.kill();
    }
}
