package com.itheima.service;

import com.itheima.dao.AnimeInfoMapper;
import com.itheima.pojo.AnimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

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

    @Autowired
    private AnimeInfoMapper animeInfoMapper;


    @Bean
    public List<AnimeInfo> getAnimeInfoAll(){

        List<AnimeInfo> animeInfos = animeInfoMapper.selectAll();
        System.out.println("service 正在执行业务逻辑的说...^_^");
        return animeInfos;


    }


}
