package com.algaworks.brewer.config.init;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
	
	@Override
	protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
		FilterRegistration.Dynamic caracterEncodingFilter = servletContext.addFilter("encodingFilter", 
				new CharacterEncodingFilter());
		caracterEncodingFilter.setInitParameter("encoding", "UTF-8");
		caracterEncodingFilter.setInitParameter("forceEncoding", "true");
		caracterEncodingFilter.addMappingForUrlPatterns(null, false, "/*");
		
	}

}
