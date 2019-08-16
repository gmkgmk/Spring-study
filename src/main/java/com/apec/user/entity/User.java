package com.apec.user.entity;

/**
 * @author guo.mk
 * @date 2019/8/15 3:40 PM
 */
public class User {
    private String name;
    private String phone;
    private int age;
    private int sex;
    private int id;

    public User(){}
    public User(String name, String phone, int age, int sex) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

}
