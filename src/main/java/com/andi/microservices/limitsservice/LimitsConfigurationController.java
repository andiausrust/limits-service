package com.andi.microservices.limitsservice;

import com.andi.microservices.limitsservice.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    // autowire Configuration - bean (class) to use application.properties
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retrieveLimitsFromConfigurations(){

        return new LimitsConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }

}