package com.learn.mybatis.pojo;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 11:42
 * @version : 1.0
 */
public class WorkCard {
    private Long id;
    private Long empId;
    private String realName;
    private String department;
    private String mobile;
    private String position;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "WorkCard{" +
                "id=" + id +
                ", empId=" + empId +
                ", realName='" + realName + '\'' +
                ", department='" + department + '\'' +
                ", mobile='" + mobile + '\'' +
                ", position='" + position + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
