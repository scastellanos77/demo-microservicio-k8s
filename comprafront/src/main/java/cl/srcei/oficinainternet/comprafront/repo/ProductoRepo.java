// Programa: ProductoRepo.java
// Descripcion:
// Autor: simon.castellanos@zeke.cl

package cl.srcei.oficinainternet.comprafront.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import cl.srcei.oficinainternet.comprafront.services.dto.ProductoDTO;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class ProductoRepo {


    @Value("${catalogoProductoUri}")
    private String catalogoProductoUri;

    @Autowired
    @Qualifier(value = "stdRestTemplate")
    private RestTemplate restTemplate;


    public Map<String, ProductoDTO> getProductoDTOs() {
        ResponseEntity<List<ProductoDTO>> catalogoProductoResponse =
                restTemplate.exchange(catalogoProductoUri + "/productos",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<ProductoDTO>>() {
                        });
        List<ProductoDTO> productoDTOs = catalogoProductoResponse.getBody();

        return productoDTOs.stream()
                .collect(Collectors.toMap(ProductoDTO::getId, Function.identity()));
    }
}
