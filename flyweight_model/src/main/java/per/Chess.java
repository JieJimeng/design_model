package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 11:14
 * @Version 1.0
 **/
public interface Chess {
    String getColor();
    void display(Coordinate coordinate);
}


class ConcreteChess implements Chess {

    String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("棋子颜色: "+color);
        System.out.println("棋子位置：("+coordinate.getX()+","+coordinate.getY()+")");
    }
}
