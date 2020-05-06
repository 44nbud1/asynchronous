package com.latihan.asynchronous.service;

import com.latihan.asynchronous.model.MessageStatus;
import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService
{

    @Async("asynch-latihan")
    public CompletableFuture<MessageStatus> messageSatu()
    {
        System.out.println("Status kepanggil satu.........");
        return CompletableFuture.completedFuture(new MessageStatus("Status kepanggil satu........."));
    }

    @Async("asynch-latihan")
    public CompletableFuture<MessageStatus> messageDua()
    {
        System.out.println("Status kepanggil dua.........");
        return CompletableFuture.completedFuture(new MessageStatus("Status kepanggil dua........."));
    }

    @Async("asynch-latihan")
    public CompletableFuture<MessageStatus> messageTiga()
    {
        System.out.println("Status kepanggil tiga.........");
        return CompletableFuture.completedFuture(new MessageStatus("Status kepanggil tiga........."));
    }

    @Async("asynch-latihan")
    public CompletableFuture<MessageStatus> messageEmpat()
    {
        System.out.println("Status kepanggil empat.........");
        return CompletableFuture.completedFuture(new MessageStatus("Status kepanggil empat........."));
    }

    @Async("asynch-latihan")
    public CompletableFuture<MessageStatus> messageLima()
    {
        System.out.println("Status kepanggil lima.........");
        return CompletableFuture.completedFuture(new MessageStatus("Status kepanggil lima........."));
    }
}
