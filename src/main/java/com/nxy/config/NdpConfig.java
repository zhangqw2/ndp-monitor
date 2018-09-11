package com.nxy.config;

import com.nxy.service.CaculateIndexJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 各线程池相关配置读取
 */
@Configuration
public class NdpConfig {
    //CaculateIndexJob注入
    @Bean
    public CaculateIndexJob caculateIndexJob(){
        return new CaculateIndexJob();
    }
}
