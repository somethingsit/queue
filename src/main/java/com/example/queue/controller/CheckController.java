package com.example.queue.controller;

import com.example.queue.dto.TestDTO;
import com.example.queue.fw.concurrent.Queue;
import com.example.queue.fw.exception.LogicException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CheckController {
    @Qualifier("checkQueue")
    private final Queue<TestDTO> checkQueue;

    @GetMapping(path = "/getData")
    public ResponseEntity<String> getToken() throws LogicException {
        String token = null;
        try {
            TestDTO testDTO = new TestDTO();
            testDTO.setTitle("HOANGPV");
            checkQueue.enqueue(testDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().body(token);
    }
}
