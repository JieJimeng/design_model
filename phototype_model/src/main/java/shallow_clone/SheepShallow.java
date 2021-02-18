package shallow_clone;

import java.util.Date;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/18 13:57
 * @Version 1.0
 **/
public class SheepShallow implements Cloneable {
    private String name;
    private Date birthday;

    public SheepShallow(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
