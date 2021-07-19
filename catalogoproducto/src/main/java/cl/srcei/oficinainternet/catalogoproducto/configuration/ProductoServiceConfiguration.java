// Programa: ProductoServiceConfiguration.java
// Descripcion:
// Mantenedor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.catalogoproducto.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class ProductoServiceConfiguration extends Configuration {

    @NotEmpty
    private String version;

    @JsonProperty
    public String getVersion() {
        return version;
    }

    @JsonProperty
    public void setVersion(String version) {
        this.version = version;
    }
}
