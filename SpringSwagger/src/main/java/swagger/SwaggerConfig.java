package swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.google.common.base.Predicates.or;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return regex("/swagger/*");
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("My REST API Swagger")
				.description("Swagger API reference for developers")
				.termsOfServiceUrl("My Mail Address")
				.contact("my mail").license("My License")
				.licenseUrl("My mail address").version("1.0").build();
	}
	
	
}
