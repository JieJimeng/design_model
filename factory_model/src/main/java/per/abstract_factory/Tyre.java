package per.abstract_factory;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/7 15:55
 * @Version 1.0
 **/
public interface Tyre {
    public void revole();
}

class LuxuryTyre implements Tyre {
    @Override
    public void revole() {
        System.out.println("旋转不磨损");
    }
}

class LowTyre implements Tyre {
    @Override
    public void revole() {
        System.out.println("磨损快");
    }
}

