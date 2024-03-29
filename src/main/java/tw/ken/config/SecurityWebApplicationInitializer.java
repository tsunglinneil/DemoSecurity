package tw.ken.config;

import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.multipart.support.MultipartFilter;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
	protected void beforeSpringSecurityFilterChain(ServletContext servletContext){
		insertFilters(servletContext, new MultipartFilter());
	}
}
