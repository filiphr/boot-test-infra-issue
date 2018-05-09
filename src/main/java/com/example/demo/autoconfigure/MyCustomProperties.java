package com.example.demo.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Filip Hrisafov
 */
@ConfigurationProperties(prefix = "demo")
public class MyCustomProperties {

    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
