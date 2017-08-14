package org.matrixstudio.springcloud.file.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file")
public class FileController {

    @GetMapping("/{id}")
    public ResponseEntity<String> get(@PathVariable String id) {
        return ResponseEntity.ok("Hit file[id=" + id + "]");
    }
}
