package com.uday;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*@Configuration
@EnableWebMvc*/
public class ResponseConfig implements WebMvcConfigurer {

	@Override public void
	  configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		
		configurer.favorPathExtension(true). 
		favorParameter(false).
		ignoreAcceptHeader(true).
		useJaf(false).
		defaultContentType(MediaType.APPLICATION_JSON); 
	//	mediaType("xml",MediaType.APPLICATION_XML). 
	//	mediaType("json", MediaType.APPLICATION_JSON);
	  
	  
	  }

}
