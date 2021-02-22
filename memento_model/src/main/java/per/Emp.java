package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/22 11:37
 * @Version 1.0
 **/
public class Emp {
    private String name;
    private int age;
    private int salary;

    public Emp(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public EmpMemento memento() {
        return new EmpMemento(this);
    }

    public void recovery(EmpMemento memento) {
        this.name = memento.getName();
        this.age = memento.getAge();
        this.salary=memento.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
