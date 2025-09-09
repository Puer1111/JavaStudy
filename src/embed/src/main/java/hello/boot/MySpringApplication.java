package hello.boot;

import hello.spring.HelloConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.List;

/**
 * 스프링 boot 체험 전에 간이 boot 클래스를 만들어보자
 */
public class MySpringApplication {

    public static void run(Class configClass, String[] args) {
        System.out.println("MySpringApplication.main args=" + List.of(args));

        // 톰캣 설정
        Tomcat tomcat = new Tomcat();
        Connector connector = new Connector();
        connector.setPort(8080);
        tomcat.setConnector(connector);

        // 스프링 컨테이너 생성
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(configClass);

        // 스프링 MVC -> DispatcherServlet 생성 & 연결
        DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);

        Context context = tomcat.addContext("", "/");
        Tomcat.addServlet(context, "dispatcherServlet", dispatcherServlet); // 디스패쳐 서블릿 내장 톰캣 연결
        context.addServletMappingDecoded("/", "dispatcherServlet");  // 서블랫 매핑
        try {
            tomcat.start();
        } catch (LifecycleException e) {
            throw new RuntimeException(e);
        }
    }
}
