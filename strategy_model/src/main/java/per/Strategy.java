package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 17:02
 * @Version 1.0
 **/
public interface Strategy {
    void getPrice(double price);
}

class OldCusMany implements Strategy {

    @Override
    public void getPrice(double price) {
        System.out.println("你属于老客户多货物区间，享受五折");
        System.out.println("你的报价是"+price*0.5);
    }
}

class OldCusLittle implements Strategy {

    @Override
    public void getPrice(double price) {
        System.out.println("你属于老客户少货物区间，享受七折");
        System.out.println("你的报价是"+price*0.7);
    }
}

class NewCusMany implements Strategy {

    @Override
    public void getPrice(double price) {
        System.out.println("你属于新客户多货物区间，享受九折");
        System.out.println("你的报价是"+price*0.5);
    }
}

class NewCusLittle implements Strategy {

    @Override
    public void getPrice(double price) {
        System.out.println("你属于新客户少货物区间，不参加活动");
        System.out.println("你的报价是"+price);
    }
}
