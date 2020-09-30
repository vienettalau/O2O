package com.learningspring.o2o.service.impl;

import com.learningspring.o2o.dao.AreaDao;
import com.learningspring.o2o.entity.Area;
import com.learningspring.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//接口是implements，类是extends
//将AreaServiImpl注入到接口里去
@Service
public class AreaServiceImpl implements AreaService {
    //service层依赖于DAO，定义一个DAO
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        //getAreaList方法被调用的时候，就会直接去调用areaDao里的queryArea方法，从数据库里取出区域列表
        return areaDao.queryArea();
    }
}
