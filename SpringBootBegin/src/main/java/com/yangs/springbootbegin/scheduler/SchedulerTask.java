package com.yangs.springbootbegin.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Descriptions
 * @Version 1.0.0
 * @Author Target Lee
 * @Date 2018/7/1 下午12:50
 */
@Component
@Slf4j
public class SchedulerTask {

    /**
     * @Scheduled(fixedRate = 3000): 定时器将在每隔3秒执行
     * @Schedule(fixedDelay = 3000): 定时器将在延迟3秒后每隔3秒执行
     * @Schedule(initialDelay = 1000, fiexdDelay = 3000): 定时器将在1秒后每隔3秒执行
     *
     *
     * @Schedule(cron = “* * * * * ?”)
     * 一个cron表达式有至少6个（也可能7个）有空格分隔的时间元素。
     * 按顺序依次为：
     * 秒         （0~59）
     * 分钟       （0~59）
     * 小时       （0~23）
     * 天（月）   （0~31，但是你需要考虑你月的天数）
     * 月        （0~11）
     * 天（星期） （1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）
     * 7.年份    （1970－2099）
     */
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 3000)
    public void reportCurrentTime() {
        System.out.println("当前时间：" + dateFormat.format(new Date()));
    }

//    //第一次延迟1秒执行，当执行完后3秒再执行
//    @Scheduled(initialDelay = 1000, fixedDelay = 3000)
//    public void timerInit() {
//        System.out.println("init : " + dateFormat.format(new Date()));
//    }
//
//    //每天19点50分50秒时执行
//    @Scheduled(cron = "50 50 19 * * ?")
//    public void timerCron() {
//        System.out.println("current time : " + dateFormat.format(new Date()));
//    }
}
