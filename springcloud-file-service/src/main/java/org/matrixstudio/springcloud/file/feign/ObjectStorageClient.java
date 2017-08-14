package org.matrixstudio.springcloud.file.feign;

import org.matrixstudio.springcloud.file.feign.fallback.ObjectStorageFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "springcloud-object-storage-service", fallbackFactory = ObjectStorageFallbackFactory.class)
public interface ObjectStorageClient {

    @GetMapping("/storage/{id}")
    ResponseEntity<String> get(@PathVariable("id") String id);
}
