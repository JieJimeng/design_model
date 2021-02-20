package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 11:48
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Chess s1 = ChessFactory.getChess("黑色");
        Chess s2 = ChessFactory.getChess("黑色");
        System.out.println(s1);
        System.out.println(s2);

        s1.display(new Coordinate(10,10));
        s2.display(new Coordinate(20,20));
    }

}
