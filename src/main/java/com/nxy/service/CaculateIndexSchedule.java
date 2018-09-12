package com.nxy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zpr on 2018/9/12.
 */
@Component
@EnableScheduling
//http://www.importnew.com/27287.html
//http://www.cnblogs.com/junrong624/p/4239517.html
public class CaculateIndexSchedule {
    private static Logger logger = LoggerFactory.getLogger(CaculateIndexSchedule.class);

    @Value("${crcss.monitor.task1.switch:true}")
    private boolean switch1;

    @Value("${crcss.monitor.task2.switch:true}")
    private boolean switch2;

    @Value("${crcss.monitor.task1.schedule}")
    private String cycleTime1;

    @Value("${crcss.monitor.task1.schedule}")
    private String cycleTime2;

    @Scheduled(cron="${crcss.monitor.task1.schedule}")
    public void executeTask1() {
        if(switch1){
            logger.info("Job started WITH schedule:  " + cycleTime1);
            // TODO:

        }

    }

    @Scheduled(cron="${crcss.monitor.task2.schedule}")
    public void executeTask2() {
        if(switch2){
            logger.info("Job started WITH schedule:  " + cycleTime2);
            // TODO:

        }

    }
}
