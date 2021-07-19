// Programa: ProductoResource.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.catalogoproducto.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.inject.Inject;

import cl.srcei.oficinainternet.catalogoproducto.services.*;
import cl.srcei.oficinainternet.catalogoproducto.model.Producto;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/productos")
@Produces(MediaType.APPLICATION_JSON)

public class ProductoResource {

    private ProductoService productoService;

    @Inject
    public ProductoResource(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GET
    @Timed
    public Response getAllProductos() {
        return Response.status(200)
                .entity(productoService.getAllProductos())
                .build();
    }

    @GET
    @Timed
    @Path("{id}")
    public Response getProducto(@PathParam("id") String id) {
        Optional<Producto> result = productoService.getProducto(id);

        if (result.isPresent()) {
            return Response.status(Response.Status.OK)
                    .entity(result.get())
                    .build();
        } else {
            return Response.status(Response.Status.NOT_FOUND)
                    .build();
        }
    }
}
