package org.matrixstudio.springcloud.file.feign.fallback;

import feign.hystrix.FallbackFactory;
import org.matrixstudio.springcloud.file.feign.ObjectStorageClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ObjectStorageFallbackFactory implements FallbackFactory<ObjectStorageClient> {
    @Override
    public ObjectStorageClient create(Throwable throwable) {

        return new ObjectStorageClient() {
            @Override
            public ResponseEntity<String> get(String id) {
                return null;
            }
        };
    }
}
