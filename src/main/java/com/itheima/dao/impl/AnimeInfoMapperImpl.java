package com.itheima.dao.impl;

import com.itheima.dao.AnimeInfoMapper;
import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic_aop
 * BelongsPackage ==> com.itheima.dao.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-10-06 14:48:17
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Mapper
public class AnimeInfoMapperImpl implements AnimeInfoMapper {
    @Override
    @Select("select * from anime_info")
    public List<AnimeInfo> selectAll() {
        System.out.println("selectAll????selectAll");
        return null;
    }
}
