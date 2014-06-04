package common;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Init;
import javax.servlet.ServletContext;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.util.WebUtils;



public class ResourceHandler implements ServletContextAware {

	private ServletContext servletContext;
	private String path;
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void init(){
		
	}
	
	@Override
	public void setServletContext(ServletContext context) {
		servletContext=servletContext;
	}
}
