package org.matrixstudio.springcloud.storage.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/storage")
public class StorageController {

    @GetMapping("{id}")
    public ResponseEntity<String> get(@PathVariable String id) {
        return ResponseEntity.ok("Hit object[id=" + id + "] : " + LocalDateTime.now().toString());
    }
}
