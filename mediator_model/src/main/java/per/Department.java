package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 15:42
 * @Version 1.0
 **/
public interface Department {
    void selfAction();
    void outAction();
}

class Development implements Department {

    Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register("develoment",this);
    }

    @Override
    public void selfAction() {
        System.out.println("收到，开始研发！");
    }

    @Override
    public void outAction() {
        System.out.println("资金短缺，让财务部拨款");
        mediator.command("finacial");
    }
}

class Finacial implements Department {

    Mediator mediator;

    public Finacial(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("收到，开始发钱！");
    }

    @Override
    public void outAction() {
        System.out.println("钱太多，让市场部跑合作");
        mediator.command("market");
    }
}

class Market implements Department {

    Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.register("market",this);

    }

    @Override
    public void selfAction() {
        System.out.println("收到，开始跑合作！");
    }

    @Override
    public void outAction() {
        System.out.println("合作方太多，让研发部加快研发");
        mediator.command("develoment");
    }
}
