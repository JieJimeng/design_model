package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/19 14:16
 * @Version 1.0
 **/
public abstract class Computer {
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    protected void sale(){
        brand.sale();
    }


}

 class Desktop extends Computer {
     public Desktop(Brand brand) {
         super(brand);
     }

     @Override
     protected void sale() {
         super.sale();
         System.out.println("台式电脑");
     }
 }

class Labtop extends Computer {
    public Labtop(Brand brand) {
        super(brand);
    }

    @Override
    protected void sale() {
        super.sale();
        System.out.println("笔记本电脑");

    }
}