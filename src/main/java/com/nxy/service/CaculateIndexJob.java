package com.nxy.service;

import jxl.Workbook;
import jxl.format.UnderlineStyle;
import jxl.write.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.FallbackWebSecurityAutoConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zpr on 2018/4/11.
 */
public class CaculateIndexJob {
    private static Logger logger = LoggerFactory.getLogger(CaculateIndexJob.class);

    /*private static String txtFilePath = "C:\\Users\\JD\\IdeaProjects\\ndp-monitor\\example\\D_RPT_NCPAS_PSN_TRDE_CUST_INFO_JL_201707.txt";
    private static String excelFilePath = new StringBuffer().append("C:\\Users\\JD\\IdeaProjects\\ndp-monitor\\example\\")
            .append("数据").append(new SimpleDateFormat("YYYYMMdd").format(new Date())).append(".xls").toString();

    private static String encoding = "GBK";*/

    @PreDestroy
    public void shutdown() {
        logger.info("Destory {}", this.getClass().getName());
    }

    @PostConstruct
    public void doExecute() throws InterruptedException {
        logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        //readAndWrite(txtFilePath);
        logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}
