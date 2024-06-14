package vn.edu.vti.vmall.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VmallDiscoveryServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(VmallDiscoveryServiceApplication.class, args);
  }

}
