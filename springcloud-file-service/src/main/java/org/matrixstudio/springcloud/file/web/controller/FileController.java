package org.matrixstudio.springcloud.file.web.controller;

import org.matrixstudio.springcloud.file.feign.ObjectStorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private ObjectStorageClient objectStorageClient;

    @GetMapping("/{id}")
    public ResponseEntity<String> get(@PathVariable String id) {

        String objectStorageInfo = Optional.ofNullable(objectStorageClient.get(id)).orElse(ResponseEntity.ok("")).getBody();

        return ResponseEntity.ok("Hit file[id=" + id + "], Object Storage Info : " + objectStorageInfo);
    }
}
