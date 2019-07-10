package com.murdock.examples.dropwizard;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.murdock.examples.dropwizard.resources.HolaFactory;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class HolaDropwizardConfiguration extends Configuration {
    // TODO: implement service configuration
    private HolaFactory holaFactory;

    @JsonProperty("helloapp")
    public HolaFactory getHolaFactory() {
        return holaFactory;
    }

    @JsonProperty("helloapp")
    public void setHolaFactory(
    		HolaFactory holaFactory) {
        this.holaFactory = holaFactory;
    }
}
