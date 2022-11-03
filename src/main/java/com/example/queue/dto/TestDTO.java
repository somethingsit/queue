package com.example.queue.dto;

import com.example.queue.fw.concurrent.ConcurrentMessage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestDTO extends ConcurrentMessage {
    private String title;

    @Override
    public String getMessageId() {
        return null;
    }

    @Override
    public String getTraceInfo() {
        return null;
    }
}
