package com.itheima.service;

import com.itheima.mapper.AnimeInfoMapper;
import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic_aop
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-07 11:09:37
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AnimeInfoService {




    public List<AnimeInfo> getAnimeAll() throws IOException {


        InputStream ras = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ras);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        AnimeInfoMapper mapper = sqlSession.getMapper(AnimeInfoMapper.class);

        List<AnimeInfo> animeInfos = mapper.selectAll();

        System.out.println("我执行了N多的业务的说....^_^");

        return animeInfos;


    }


}


