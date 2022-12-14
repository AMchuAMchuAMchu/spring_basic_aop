package com.itheima.test;

import com.itheima.config.SpringConfig;
import com.itheima.pojo.AnimeInfo;
import com.itheima.service.AnimeInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic_aop
 * BelongsPackage ==> com.itheima.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-07 11:14:02
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeTest {

    @Test
    public void testAnimeAll() throws IOException {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

        AnimeInfoService bean = ac.getBean(AnimeInfoService.class);

        List<AnimeInfo> animeAll = bean.getAnimeAll();

        System.out.println();
        System.out.println();
        System.out.println();

        animeAll.forEach(System.out::println);

    }


}
