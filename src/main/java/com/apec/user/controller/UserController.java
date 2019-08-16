package com.apec.user.controller;

import com.apec.user.dao.UserDao;
import com.apec.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author guo.mk
 * @date 2019/8/16 10:43 AM
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserDao userDao;

    /**
     * @return
     */
    @RequestMapping("/list")
    public List<User> getAll() {
        System.out.println("查询所有数据");
        List<User> userList = userDao.queryAll();
        return userList;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insert(@RequestParam(value = "name", required = true) String name,
                      @RequestParam("age") int age,
                      @RequestParam("sex") int sex,
                      @RequestParam("phone") String phone) {

        int result = userDao.addUser(name, phone, sex, age);
        return result;
    }


    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public int updateUser(@PathVariable("id") int id,
                          @RequestParam(value = "name", required = true) String name,
                          @RequestParam("age") int age,
                          @RequestParam("sex") int sex,
                          @RequestParam("phone") String phone) {

        int result = userDao.updateUser(id,name, phone, sex, age);
        return result;
    }

    @RequestMapping(value = "/remove/{id}",method = RequestMethod.DELETE)
    public int removeUser(@PathVariable("id") int id ){
        int result = userDao.removeById(id);
        return result;
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
        User user =  userDao.queryById(id);
        return user;
    }

}
