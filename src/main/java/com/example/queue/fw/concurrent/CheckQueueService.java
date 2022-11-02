package com.example.queue.fw.concurrent;

public interface CheckQueueService {
    void setSysOverload(boolean var1);

    boolean isSysOverload();

    void check() throws Exception;
}
