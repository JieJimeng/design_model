package per;

/**
 * @Description TODO
 * @Author jie jimeng
 * @Date 2021/2/20 13:58
 * @Version 1.0
 **/
public class LeaveRequest {
    private String name;
    private  int day;
    private String reason;

    public LeaveRequest(String name, int day, String reason) {
        this.name = name;
        this.day = day;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
