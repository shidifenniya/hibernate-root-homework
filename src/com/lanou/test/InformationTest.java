package com.lanou.test;

import com.lanou.dao.InformationDao;
import com.lanou.dao.impl.InformationDaoImpl;
import com.lanou.domain.Information;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试类
 * Created by 最终变身的小黑 on 17/10/17.
 */
public class InformationTest {

    private InformationDao informationDao = new InformationDaoImpl();

    @Test
    public void save() {

        Information information = new Information("yayoi", "123456", "噶韭菜专业户!");

        informationDao.save(information);

    }

    @Test
    public void login() {

        boolean yayoi = informationDao.login("yayoi", "123456");

        if (yayoi) {

            System.out.println("yayoi登录成功");
        } else {

            System.out.println("yayoi登录失败");

        }

        String s = "from Information where username=:username and password=:password";

        Map<String,Object> map = new HashMap<>();

        map.put("username","yayoi");

        map.put("password","123456");

        List<Information> list = informationDao.findAll(s, map);

        if(list.size() > 0){

            System.out.println("yayoi登录成功");

        }else {

            System.out.println("yayoi登录失败");

        }

    }

}
