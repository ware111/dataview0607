package com.eeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonthTeacherBean {


    private int size;

    @Id
    private String time_stamp;

    private String flag;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }
}
