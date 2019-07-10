package com.murdock.examples.dropwizard;
import com.murdock.examples.dropwizard.resources.HolaFactory;
import com.murdock.examples.dropwizard.resources.HolaRestResourceV1;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HolaDropwizardApplication extends Application<HolaDropwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HolaDropwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "HolaDropwizard";
    }

    @Override
    public void initialize(final Bootstrap<HolaDropwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final HolaDropwizardConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new HolaRestResourceV1());
//        environment.jersey().register(new HolaFactory(configuration.getHolaFactory().getDescription())));
    }

}
