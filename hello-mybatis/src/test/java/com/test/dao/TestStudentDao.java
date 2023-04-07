package com.test.dao;

import com.test.data.Hobby;
import com.test.data.Sex;
import com.test.data.Student;
import com.test.data.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class TestStudentDao {
    private InputStream in;
    private SqlSession sqlSession;
    private IStudentDao iStudentDao;


    @Before
    public void init()throws Exception{
        //1.读取配置文件
        in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        sqlSession = factory.openSession();
        iStudentDao = sqlSession.getMapper(IStudentDao.class);
    }

    @Test
    public void test(){
        Student student = iStudentDao.getStudentById(9);
        System.out.println(student);
    }

    @Test
    public void insert(){
//        int id;
//        String name;
//        Sex sex;
//        String birthday;
//        int classId;

        Student s = new Student(
                "xiyangyangxiyangyangxiyangyangxiyangyangxiyangyangxiyangyangxiyangyangxiyangyangxiyangyangxiyangyangxiyangyangxiyangyangxiyangyang",
                Sex.Male,
                "1996",
                1,
                new Hobby("羽毛球"),
                new Date()
        );

        System.out.println(s.getId());
        try{
            iStudentDao.insert(s);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(s.getId());

    }

    @Test
    public void getAll(){
        List<Student> students = iStudentDao.getAll();
        students.forEach(System.out::println);
    }

    @Test
    public void deleteById(){
        iStudentDao.deleteById(3);
    }

    @Test
    public void updateBirthday(){
        Student student = new Student();
        student.setId(4);
        student.setBirthday("2000");

        iStudentDao.updateBirthday(student);
    }



    @After
    public void destroy() throws Exception{
        sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }
}
