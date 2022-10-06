package com.itheima.service;

import com.itheima.dao.AnimeInfoMapper;
import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic_aop
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-06 14:56:02
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AnimeService {


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




    @Bean
    public List<AnimeInfo> getAnimeInfoAll(){

        List<AnimeInfo> animeInfos = mapper.selectAll();
        System.out.println("service 正在执行业务逻辑的说...^_^");
        return animeInfos;

    }

}
