package com.itheima.service;

import com.itheima.dao.AnimeInfoMapper;
import com.itheima.pojo.AnimeInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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


    @Autowired
    private AnimeInfoMapper animeInfoMapper;


    @Test
    public void testAnimeAll(){

        List<AnimeInfo> animeInfos = animeInfoMapper.selectAll();
        System.out.println();
        System.out.println();
        System.out.println();
        animeInfos.forEach(System.out::println);


    }

}
