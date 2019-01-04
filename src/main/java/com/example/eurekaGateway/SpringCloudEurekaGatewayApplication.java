package com.example.eurekaGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

//@EnableSwagger2
public class SpringCloudEurekaGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaGatewayApplication.class, args);
	}
	
	
//	  @Bean public Docket swaggerApi() {
//	  
//	  return new Docket(DocumentationType.SWAGGER_2)
//	  
//	  .select()
//	  
//	  .apis(RequestHandlerSelectors.basePackage("com.example.eurekaGateway"))
//	  
//	  .paths(PathSelectors.any())
//	  
//	  .build()
//	  
//	  .apiInfo(new ApiInfoBuilder().version("1.0").title("Gateway API")
//	  .description("Documentation Gateway API v1.0").build());
//	  
//	  }
	 

}

