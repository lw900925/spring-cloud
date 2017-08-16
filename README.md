# Spring Cloud示例项目

本项目是Spring Cloud的示例项目，采用Gradle工具构建，请搭配博客中的教程食用。

- [Spring Cloud 微服务：Spring Cloud Config](https://lw900925.github.io/spring-cloud/spring-cloud-config.html)
- Spring Cloud 微服务：Spring Cloud Eureka（未完成）

## 如何运行

### 1.构建

```bash
git clone https://github.com/lw900925/springcloud.git

cd ./springcloud/

# for windows
gradlew.bat clean build -x test

# for linux or macOS
./gradlew clean build -x test
```

### 2.运行

构建完成后，每个子项目下的`/build/libs/`目录，执行下面的命令：

```bash
java -jar -Dspring.profiles.active=dev springcloud-eureka-0.0.1-SNAPSHOT.jar
```

启动顺序以此为：

- springcloud-eureka
- springcloud-config-server
- springcloud-file-service
- springcloud-object-storage-service
- springcloud-zuul
- springcloud-admin-dashboard
