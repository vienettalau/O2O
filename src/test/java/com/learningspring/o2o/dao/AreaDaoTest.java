package com.learningspring.o2o.dao;

import com.learningspring.o2o.BaseTest;
import com.learningspring.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

//继承BaseTest，AreaDaoTest启动时，就会调用BaseTest里的方法，去加载spring—dao的配置文件

public class AreaDaoTest extends BaseTest {
    @Autowired
    //引入AreaDao，方便测试
    private AreaDao areaDao;

    @Test
    //写测试方法
    //测试AreaDao下的queryArea方法
    public void testQueryArea(){
        //queryArea返回的是list对象，并且list是以Area类型为基础的
        List<Area> areaList = areaDao.queryArea();
        System.out.println("Result!!!!!!!");
        //数据库里实际的数据条数等于assertEquals的expected的值，则数据库area测试成功
        assertEquals(3,areaList.size());

    }


}
