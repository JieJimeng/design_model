package per;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 15:39
 * @Version 1.0
 **/
public interface Mediator {
    void register(String name,Department department);
    void command(String name);
}

class Manager implements Mediator {
    private Map<String,Department> map =new HashMap<String, Department>();


    @Override
    public void register(String name, Department department) {
        if (map.get(name) == null) {
            map.put(name, department);
        } else {
            System.out.println("已存在该部门信息！");
        }
    }

    @Override
    public void command(String name) {
        map.get(name).selfAction();
    }
}
