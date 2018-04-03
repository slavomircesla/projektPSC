package sk.akademiasovy;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TownsPscApplication extends Application<TownsPscConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TownsPscApplication().run(args);
    }

    @Override
    public String getName() {
        return "TownsPsc";
    }

    @Override
    public void initialize(final Bootstrap<TownsPscConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TownsPscConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }
}
