package com.neverend.stream.controller;

import com.neverend.stream.service.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StreamMessageController {
    @Autowired
    private MessageProvider messageProvider;

    @GetMapping("/send/msg")
    public String sendMsg() {
        return messageProvider.sendMsg();
    }
}
