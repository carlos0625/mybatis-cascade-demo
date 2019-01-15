package com.learn.mybatis.enums;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/15 11:16
 * @version : 1.0
 */
public enum  Sex {
    MALE(1, "男"),
    FEMALE(0, "女");

    private int id;
    private String desc;

    Sex(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static Sex getSexById(int id) {
        for (Sex sex : Sex.values()) {
            if (sex.getId() == id)
                return sex;
        }
        return null;
    }
}
