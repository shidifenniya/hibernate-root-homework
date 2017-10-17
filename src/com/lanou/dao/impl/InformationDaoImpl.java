package com.lanou.dao.impl;

import com.lanou.dao.InformationDao;
import com.lanou.domain.Information;
import com.lanou.util.HibernateUtil;
import org.hibernate.Query;

import java.util.List;

/**
 * Created by dllo on 17/10/17.
 */
public class InformationDaoImpl extends BaseDaoImpl<Information> implements InformationDao{


    @Override
    public boolean login(String username, String password) {

        String hql = "from Information where username=? and password=?";

        Query qr = HibernateUtil.getSession().createQuery(hql);

        qr.setString(0,username);

        qr.setString(1,password);

        List<Information> list = qr.list();

        return list.size() > 0;
    }
}
