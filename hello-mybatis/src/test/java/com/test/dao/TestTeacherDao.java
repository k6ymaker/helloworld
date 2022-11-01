package com.test.dao;

import com.test.data.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class TestTeacherDao {
    private InputStream in;
    private SqlSession sqlSession;


    @Before
    public void init()throws Exception{
        //1.读取配置文件
        in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        sqlSession = factory.openSession();
    }

    @Test
    public void test(){
        ITeacherDao iTeacherDao = sqlSession.getMapper(ITeacherDao.class);
        Teacher teacher = iTeacherDao.getTeacherById(1);
        System.out.println(teacher);
    }

    @Test
    public void updateSex(){
        ITeacherDao iTeacherDao = sqlSession.getMapper(ITeacherDao.class);
        Teacher teacher = iTeacherDao.getTeacherById(1);
        teacher.setSex("female");
        iTeacherDao.updateSex(teacher);
    }

    @After
    public void destory() throws Exception{
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }
}
