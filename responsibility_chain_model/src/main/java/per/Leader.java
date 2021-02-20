package per;

import javax.naming.Name;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 14:00
 * @Version 1.0
 **/
public abstract class Leader {
    protected String name;
    protected Leader nextLeader; //核心

    public Leader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Leader getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleResquest(LeaveRequest leaveRequest);
}


class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleResquest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDay() < 3) {
            System.out.println("工作人员" + leaveRequest.getName() + "因"
                    + leaveRequest.getReason() + "原因，需要请假" + leaveRequest.getDay() + "天。");
            System.out.println(name + "主任通过");
        } else {
            nextLeader.handleResquest(leaveRequest);
        }

    }
}

class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleResquest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDay() < 10) {
            System.out.println("工作人员" + leaveRequest.getName() + "因"
                    + leaveRequest.getReason() + "原因，需要请假" + leaveRequest.getDay() + "天。");
            System.out.println(name + "经理通过");
        } else {
            nextLeader.handleResquest(leaveRequest);
        }

    }
}

class Boss extends Leader {
    public Boss(String name) {
        super(name);
    }

    @Override
    public void handleResquest(LeaveRequest leaveRequest) {
        if (leaveRequest.getDay() < 20) {
            System.out.println("工作人员" + leaveRequest.getName() + "因"
                    + leaveRequest.getReason() + "原因，需要请假" + leaveRequest.getDay() + "天。");
            System.out.println(name + "老板通过");
        } else {
            System.out.println("工作人员" + leaveRequest.getName()+"已被辞退！");
        }

    }
}
