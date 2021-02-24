package com.demo.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) throws SchedulerException {

        // 1、调度器scheduler
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        // 2、触发器trigger
        SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
                .startNow() // 程序启动后开始
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).repeatForever()) // 每隔24小时执行一次，没有次数限制
                .endAt(new GregorianCalendar(2021, 1, 25, 00, 34, 30).getTime()) // 停止的时间
                .build();

        // 3、自定义任务jobDetail
        JobDetail jobDetail = JobBuilder.newJob(PullWakaTimeData.class).withIdentity("jobDetail1", "group1").build();

        // 4、将任务jobDetail和触发器trigger增加到调度器中
        scheduler.scheduleJob(jobDetail, trigger);

        // 5、启动触发器
        scheduler.start();
    }
}
