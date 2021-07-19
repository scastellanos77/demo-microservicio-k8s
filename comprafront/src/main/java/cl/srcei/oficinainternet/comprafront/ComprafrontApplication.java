// Programa: ComprafrontApplication.java
// Descripcion: 
// Autor: simon.castellanos@zeke.cl


package cl.srcei.oficinainternet.comprafront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrix
public class ComprafrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComprafrontApplication.class, args);
    }

    @Bean(name = "stdRestTemplate")
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
