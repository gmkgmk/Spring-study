package com.apec.user.dao;

import com.apec.user.entity.User;

import java.util.List;

/**
 * @author guo.mk
 * @date 2019/8/16 10:42 AM
 */
public interface UserDao {
    /**
     * @return
     */
    List<User> queryAll();

    /**
     * @param name
     * @param phone
     * @param sex
     * @param age
     * @return
     */
    int addUser(String name, String phone, int sex, int age);

    /**
     * @param id
     * @param name
     * @param phone
     * @param sex
     * @param age
     * @return
     */
    int updateUser(int id,String name, String phone, int sex, int age);

    /**
     * @param id
     * @return
     */
    int removeById(int id);

    /**
     * @param id
     * @return
     */
    User queryById(int id);
}
