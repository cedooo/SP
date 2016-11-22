package com.dhcc.ywp.service.world.impl;

import com.dhcc.ywp.po.Country;
import com.dhcc.ywp.service.world.WorldCountryService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cedo on 2016/11/18.
 * world service 实现
 */
@Component
public class WorldCountryServiceImpl implements WorldCountryService {

    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    public WorldCountryServiceImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<Country> allCountry() {
        SqlSession sess = sqlSessionFactory.openSession(true);
        List<Country> listCountry = new ArrayList<Country>();
        try{
            List<Country> listCountryDB = sess.selectList("com.dhcc.ywp.po.selectAllCountry");
            if(listCountryDB!=null && listCountryDB.size()>0){
                listCountry.addAll(listCountryDB);
            }
        }finally{
            if(sess!=null){
                sess.commit();
                sess.close();
            }
        }
        return listCountry;
    }
}
