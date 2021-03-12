package com.septemberhx.cnweather;

import com.hitices.mclient.annotation.MClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2020/3/30
 */
@SpringBootApplication
@EnableEurekaClient
@MClient
public class CNWeatherMain {
    public static void main(String[] args) {
        SpringApplication.run(CNWeatherMain.class, args);
    }
}
