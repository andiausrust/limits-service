package com.andi.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// limits-service min + max are defined in application.properties
// @ConfigurationsProperties to expose them: everything that starts with limits-service
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

    // matching the names in application.properties (limits-service. ... /maximum, minimum)
    private int minimum;
    private int maximum;


    // you need to create getters & setters to use application.properties
    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
