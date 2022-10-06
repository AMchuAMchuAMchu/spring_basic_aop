package com.itheima.invoke;

import com.itheima.pojo.AnimeInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic_aop
 * BelongsPackage ==> com.itheima.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-06 14:07:57
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@Aspect
public class AnimeService {

    @Pointcut("execution(* com.itheima.*.AnimeInfoMapper.selectAll(..))")
    public void pt01(){}
//
//    @Pointcut("execution(* com.itheima.*.TestGetAnimeInfo.getAnimeInfo(..))")
//    public void pt01(){}


    @Around("pt01()")
    public List<AnimeInfo> resumeTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();

        List<AnimeInfo> proceed = null;

        for (int i = 0; i < 10000; i++) {
            proceed  = (List<AnimeInfo>) pjp.proceed();
        }

        long end = System.currentTimeMillis();

        System.out.println("耗时:"+(end-start)+"毫秒...");
        return proceed;
    }







}
