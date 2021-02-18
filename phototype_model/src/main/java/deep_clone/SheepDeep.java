package deep_clone;

import java.util.Date;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/18 13:57
 * @Version 1.0
 **/
public class SheepDeep implements Cloneable {
    private String name;
    private Date birthday;

    public SheepDeep(String name, Date birthday) {
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
        Object obj = super.clone();
        SheepDeep s2=(SheepDeep)obj;
        s2.birthday=(Date) this.birthday.clone();
        return s2;
    }
}
