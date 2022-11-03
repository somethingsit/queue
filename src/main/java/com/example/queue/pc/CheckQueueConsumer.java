package com.example.queue.pc;

import com.example.queue.fw.concurrent.ConcurrentMessage;
import com.example.queue.fw.concurrent.Consumer;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Log4j

@RequiredArgsConstructor
public class CheckQueueConsumer extends Consumer<ConcurrentMessage> {

    @Override
    public void process(ConcurrentMessage var1) throws Exception {
        log.info("===============HANDLE QUEUE-------------->");
    }
}
