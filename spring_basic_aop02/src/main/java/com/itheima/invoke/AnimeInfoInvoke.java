package com.itheima.invoke;

import com.itheima.pojo.AnimeInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_basic_aop
 * BelongsPackage ==> com.itheima.invoke
 * Version ==> 1.0
 * CreateTime ==> 2022-10-07 11:29:13
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Aspect
@Component
public class AnimeInfoInvoke {

    @Pointcut("execution(* com.itheima.*.AnimeInfoService.getAnimeAll(..))")
    public void pt() {
    }

    @Around("pt()")
    public List<AnimeInfo> invoke01(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        List<AnimeInfo> proceed = null;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            count++;
            proceed = (List<AnimeInfo>) pjp.proceed();
            System.out.println("第"+count+"次");
        }

        long end = System.currentTimeMillis();

        System.out.println("耗时:" + (end - start) + "毫秒...");

        return proceed;
    }


}
