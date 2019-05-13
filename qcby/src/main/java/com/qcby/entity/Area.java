package com.qcby.entity;

import java.util.Date;

public class Area {
    private Integer area_id;

    private String area_name;

    private String area_desc;

    private Integer priority;

    private Date create_time;

    private Date last_edit_time;

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name == null ? null : area_name.trim();
    }

    public String getArea_desc() {
        return area_desc;
    }

    public void setArea_desc(String area_desc) {
        this.area_desc = area_desc == null ? null : area_desc.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getLast_edit_time() {
        return last_edit_time;
    }

    public void setLast_edit_time(Date last_edit_time) {
        this.last_edit_time = last_edit_time;
    }

    @Override
    public String toString() {
        return "Area{" +
                "area_id=" + area_id +
                ", area_name='" + area_name + '\'' +
                ", area_desc='" + area_desc + '\'' +
                ", priority=" + priority +
                ", create_time=" + create_time +
                ", last_edit_time=" + last_edit_time +
                '}';
    }
}