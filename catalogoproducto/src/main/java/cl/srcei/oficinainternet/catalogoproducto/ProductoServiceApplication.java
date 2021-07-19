// Programa:    ProductoServiceAppication.java
// Descripcion:  
// Mantenedor:  simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.catalogoproducto;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

;
import cl.srcei.oficinainternet.catalogoproducto.healthchecks.BasicHealthCheck;
import cl.srcei.oficinainternet.catalogoproducto.configuration.ProductoServiceConfiguration;
import cl.srcei.oficinainternet.catalogoproducto.resources.ProductoResource;


public class ProductoServiceApplication extends Application<ProductoServiceConfiguration> {
    public static void main(String[] args) throws Exception {
        new ProductoServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "product-list-service";
    }

    @Override
    public void initialize(Bootstrap<ProductoServiceConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ProductoServiceConfiguration config,
                    Environment environment) {
        final BasicHealthCheck healthCheck = new BasicHealthCheck(config.getVersion());
        //environment.healthCheck().register("template", healthCheck);
        environment.healthChecks().register("template", healthCheck);

        Injector injector = Guice.createInjector();
        environment.jersey().register(injector.getInstance(ProductoResource.class));
    }
}
