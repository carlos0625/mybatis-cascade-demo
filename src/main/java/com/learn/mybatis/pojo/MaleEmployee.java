package com.learn.mybatis.pojo;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 11:39
 * @version : 1.0
 */
public class MaleEmployee extends Employee {
    private MaleHealthForm maleHealthForm;

    public MaleHealthForm getMaleHealthForm() {
        return maleHealthForm;
    }

    public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
        this.maleHealthForm = maleHealthForm;
    }
}
