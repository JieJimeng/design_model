package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 11:51
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        CareTake ct = new CareTake();

        Emp emp = new Emp("张三", 18, 900);
        ct.setEmpMemento(emp.memento());
        System.out.println("第一次展示    名字："+emp.getName()+",年龄："+emp.getAge()+",工资："+emp.getSalary());
        emp.setName("李四");
        emp.setAge(28);
        emp.setSalary(2000);
        System.out.println("第二次展示    名字："+emp.getName()+",年龄："+emp.getAge()+",工资："+emp.getSalary());
        emp.recovery(ct.getEmpMemento());
        System.out.println("第三次展示    名字："+emp.getName()+",年龄："+emp.getAge()+",工资："+emp.getSalary());

    }

}
