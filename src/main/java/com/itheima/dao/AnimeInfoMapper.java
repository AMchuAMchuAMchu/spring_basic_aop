package com.itheima.dao;

import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic_aop
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-06 13:24:00
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Mapper
public interface AnimeInfoMapper {

    @Select("select * from anime_info")
    List<AnimeInfo> selectAll();

}
