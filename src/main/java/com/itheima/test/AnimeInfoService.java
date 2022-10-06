package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.dao.AnimeInfoMapper;
import com.itheima.dao.TestGetAnimeInfo;
import com.itheima.invoke.AnimeService;
import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic_aop
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-06 13:25:48
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeInfoService {


    private static InputStream ras;

    private static SqlSessionFactory build;

    private static SqlSession sqlSession;

    private static AnimeInfoMapper mapper;

    static {

        try {
            ras = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        build = new SqlSessionFactoryBuilder().build(ras);

        sqlSession = build.openSession();

        mapper = sqlSession.getMapper(AnimeInfoMapper.class);

    }


    @Test
    public void testAnime02(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        TestGetAnimeInfo bean = ac.getBean(TestGetAnimeInfo.class);

        bean.getAnimeInfo();


    }


    @Test
    public void testSelectAnime(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        AnimeInfoMapper bean = ac.getBean(AnimeInfoMapper.class);

        List<AnimeInfo> animeInfos = bean.selectAll();

        List<AnimeInfo> animeInfos1 = bean.selectList(null);

        animeInfos.forEach(System.out::println);

    }




    @Test
    public void testSelectAnimeAllResumeTime(){

        List<AnimeInfo> animeInfos = mapper.selectAll();

        animeInfos.forEach(System.out::println);

    }


    @Test
    public void testAnimeAll(){

        List<AnimeInfo> animeInfos = mapper.selectAll();

        System.out.println();
        System.out.println();
        System.out.println();

        animeInfos.forEach(System.out::println);

    }

}
