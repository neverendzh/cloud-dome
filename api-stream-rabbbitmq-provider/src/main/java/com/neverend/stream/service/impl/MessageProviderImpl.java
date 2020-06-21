package com.neverend.stream.service.impl;

import com.neverend.stream.service.MessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

@EnableBinding(Source.class)
@Slf4j
public class MessageProviderImpl implements MessageProvider {
    @Resource
    private MessageChannel output; //消息发送管道

    @Override
    public String sendMsg() {
        String uuid = UUID.randomUUID().toString();
        boolean send = output.send(MessageBuilder.withPayload(uuid).build());
        log.info("uuid:" + uuid);
        return send + ""+uuid;
    }
}
