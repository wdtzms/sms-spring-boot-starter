package com.sms.config;

import com.sms.properties.SmsProperties;
import com.sms.service.impl.AliyunSmsSenderImpl;
import com.sms.service.impl.TencentSmsSenderImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(value = SmsProperties.class)
@Configuration
public class SmsAutoConfiguration {

    /**
     *  阿里云发送短信的实现类
     * @param smsProperties
     * @return
     */
    @Bean(name = "aliYunSmsSender")
    public AliyunSmsSenderImpl aliYunSmsSender(SmsProperties smsProperties){
        return new AliyunSmsSenderImpl(smsProperties.getAliyun());
    }
    /**
     * 腾讯云发送短信的实现类
     * @param smsProperties
     * @return
     */
    @Bean(name = "tencentSmsSender")
    public TencentSmsSenderImpl tencentSmsSender(SmsProperties smsProperties){
        return new TencentSmsSenderImpl(smsProperties.getTencent());
    }
}
