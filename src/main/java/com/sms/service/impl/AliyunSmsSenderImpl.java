package com.sms.service.impl;

import com.sms.properties.SmsProperties;
import com.sms.service.SmsSender;

public class AliyunSmsSenderImpl implements SmsSender {

    private SmsProperties.SmsMessage smsMessage;

    public AliyunSmsSenderImpl(SmsProperties.SmsMessage smsProperties) {
        this.smsMessage = smsProperties;
    }
    @Override
    public String send(String message) {
        System.out.println(smsMessage.toString()+"开始发送短信==》短信内容："+message);
        return smsMessage.toString()+"开始发送短信==》短信内容："+message;
    }
}
