package per;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 11:38
 * @Version 1.0
 **/
public class ChessFactory {
    private static Map<String,Chess> map = new HashMap<String, Chess>();
    public static  Chess getChess( String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            Chess cc = new ConcreteChess(color);
            map.put(color,cc);
            return cc;
        }
    }
}
