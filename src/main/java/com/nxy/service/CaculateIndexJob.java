package com.nxy.service;

import com.nxy.utils.HttpRequest;
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
import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
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
    public void doExecute() throws InterruptedException, UnsupportedEncodingException {
        logger.info("------------------------------------------------------------------");
        String Url = "http://testwx.nongxinyin.com/weixinServer/NXYExceptionSendMsg.do";
        StringBuilder requestParam = new StringBuilder();
        requestParam.append("reportTime=" + URLEncoder.encode("2019-12-11 18:30:00","utf-8"));
        requestParam.append("&reportObject=" + URLEncoder.encode("172.22.1.110","utf-8"));
        //requestParam.append("&reportItem=" + URLEncoder.encode("超时率", "utf-8"));
        requestParam.append("&reportItem=" + "zhaopr");
        requestParam.append("&reportState=" + URLEncoder.encode("超时率超阈值","utf-8"));
        requestParam.append("&reportDescription=" + URLEncoder.encode("超时率过高，且基数过大","utf-8"));
        requestParam.append("&remark=" + URLEncoder.encode("如有问题请联系XXX。","utf-8"));
        logger.info(requestParam.toString());
        //String s = HttpRequest.sendPost("http://testwx.nongxinyin.com/weixinServer/NXYExceptionSendMsg.do",
        //        "reportTime=2017-12-17 18:30:00&reportObject=A设备(72.160.0.14)&reportItem=CPU负载率&reportState=异常状态&reportDescription=CPU负载率过高！&remark=如有问题请联系XXX。");
        try{
            String message = requestParam.toString();
            //String s = HttpRequest.sendPost(Url, message);
            String s = HttpRequest.sendGet(Url, message);
        }catch (Exception ex){
            logger.error("发送至微信服务器失败: " + ex.getMessage());
        }
        logger.info("------------------------------------------------------------------");
    }
}


