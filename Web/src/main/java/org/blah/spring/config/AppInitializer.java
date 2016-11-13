package org.blah.spring.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
/**
 * Created by adam on 13.11.16.
 */
public class AppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context
                = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);
        context.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet(
                "dispatcher", new DispatcherServlet(context));

        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }

}
