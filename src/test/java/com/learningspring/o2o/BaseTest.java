package com.learningspring.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 *
 */

//此处用的是注解，需要告诉junit，spring是要用什么类去跑单元测试的
//用的是spring和junit的整合，这里用的是springjunit4classrunner.class
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit，spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class BaseTest {
}
