package org.matrixstudio.springcloud.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ObjectStorageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObjectStorageServiceApplication.class, args);
    }
}
