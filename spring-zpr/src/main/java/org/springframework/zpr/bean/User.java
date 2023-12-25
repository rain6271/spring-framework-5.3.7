package org.springframework.zpr.bean;

/**
 * TODO
 *
 * @author WangYu
 * @date 2023/12/1 18:17
 */
//@Component
public class User {

    private String name;

    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
