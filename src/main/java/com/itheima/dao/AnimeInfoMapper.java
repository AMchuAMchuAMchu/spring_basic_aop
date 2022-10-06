package com.itheima.dao;

import com.itheima.pojo.AnimeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic_aop
 * BelongsPackage ==> com.itheima.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-06 13:24:00
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public interface AnimeInfoMapper {

    @Select("select * from anime_info")
    List<AnimeInfo> selectAll();

}
