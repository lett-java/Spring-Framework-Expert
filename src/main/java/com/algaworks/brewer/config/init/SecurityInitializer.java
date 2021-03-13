package com.algaworks.brewer.config.init;

import java.util.EnumSet;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.SessionTrackingMode;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
	
	@Override
	protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
//		servletContext.getSessionCookieConfig().setMaxAge(20);
		servletContext.setSessionTrackingModes(EnumSet.of(SessionTrackingMode.COOKIE));

		FilterRegistration.Dynamic caracterEncodingFilter = servletContext.addFilter("encodingFilter", 
				new CharacterEncodingFilter());
		caracterEncodingFilter.setInitParameter("encoding", "UTF-8");
		caracterEncodingFilter.setInitParameter("forceEncoding", "true");
		caracterEncodingFilter.addMappingForUrlPatterns(null, false, "/*");
		
	}

}
