package shallow_clone;


import java.util.Date;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/18 14:12
 * @Version 1.0
 **/
public class Client_01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(12312312331L);
        SheepShallow s1 = new SheepShallow("少利", date);
        //浅拷贝
        SheepShallow s2 = (SheepShallow) s1.clone();

        System.out.println("1号："+s1.getBirthday());
        System.out.println("2号："+s2.getBirthday());
        /*date.setTime(23423423432L);
        System.out.println("3号："+s1.getBirthday());
        System.out.println("4号："+s2.getBirthday());*/
        System.out.println(s1.getBirthday()==s2.getBirthday());
    }
}
