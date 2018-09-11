package com.nxy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zpr on 2018/4/11.
 */

@Component
@EnableScheduling
public class CaculateIndexSchedule {
    private static Logger logger = LoggerFactory.getLogger(CaculateIndexSchedule.class);

    @Value("${task.set.scheduling:true}")
    private boolean isScheduled;

    @Value("${task.set.cycle.time}")
    private String cycleTime;

    @Scheduled(cron="${task.set.cycle.time}")
    //@Scheduled(cron="*/10 * * * * ?")
    //http://www.importnew.com/27287.html
    //http://www.cnblogs.com/junrong624/p/4239517.html
    public void executeTask() {
        if(isScheduled){
            logger.info("Job started WITH schedule:  " + cycleTime);
            //pisasETLProcess.excute();
        }

    }

    /*@Scheduled(cron="0/5 * * * * ?")
    public void suicide() {
        if(!isScheduled){
            logger.info("Job suiciding...");
        }
    }*/
}
