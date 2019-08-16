//package com.apec.user.controller;
//
//import com.apec.user.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
///**
// * @author guo.mk
// * @date 2019/8/15 5:22 PM
// */
//@RestController
//public class BookController {
//
//    @Autowired
//    private BookDao bookDao;
//
//    @RequestMapping("/api")
//    List<User> home() {
//        System.out.println("执行"+'\n');
//        List<User> list = bookDao.queryAll();
//        System.out.println("list:"+list.get(0).getName());
//        return list;
//    }
//
//    @RequestMapping(value="/user/{userId}",method= RequestMethod.GET)
//    int update(@PathVariable("userId") int userId) {
//        System.out.println("打印出的id为"+userId);
//        int num = bookDao.reduceNumber(userId);
//        return num;
//    }
//
//    @RequestMapping(value="add/{name}/{age}")
//    int insert(@PathVariable("name") String name,@PathVariable("age") int age){
//        System.out.println("姓名+"+name+"年龄"+age);
//        int result = bookDao.insertAppointment(name,age);
//        return result;
//    }
//}
