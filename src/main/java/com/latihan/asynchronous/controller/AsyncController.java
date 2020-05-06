package com.latihan.asynchronous.controller;

import com.latihan.asynchronous.model.MessageStatus;
import com.latihan.asynchronous.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncController
{
    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async")
    public ResponseEntity<?> async()
    {
        CompletableFuture<MessageStatus> message1 = asyncService.messageSatu();
        CompletableFuture<MessageStatus> message2 = asyncService.messageDua();
        CompletableFuture<MessageStatus> message3 = asyncService.messageTiga();
        CompletableFuture<MessageStatus> message4 = asyncService.messageEmpat();
        CompletableFuture<MessageStatus> message5 = asyncService.messageLima();
        CompletableFuture.allOf(message1,message2,message3,message4,message5).join();

        return ResponseEntity.ok(new MessageStatus("ok ndann"));
    }
}
