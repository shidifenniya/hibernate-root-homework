package com.lanou.dao;

import com.lanou.domain.Information;

/**
 * Created by dllo on 17/10/17.
 */
public interface InformationDao extends BaseDao<Information>{

    boolean login(String username, String password);

}
