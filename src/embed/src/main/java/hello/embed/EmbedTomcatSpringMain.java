package hello.embed;

import hello.servlet.HelloServlet;
import hello.spring.HelloConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class EmbedTomcatSpringMain {
    public static void main(String[] args) throws LifecycleException {

        System.out.println("EmbedTomcatServletMain.main");

        // 톰캣 설정
        Tomcat tomcat = new Tomcat();
        Connector connector = new Connector();
        connector.setPort(8080);
        tomcat.setConnector(connector);

        // 스프링 컨테이너 생성
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(HelloConfig.class);

        // 스프링 MVC -> DispatcherServlet 생성 & 연결
        DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);

        Context context = tomcat.addContext("", "/");       
        Tomcat.addServlet(context,"dispatcherServlet",dispatcherServlet); // 디스패쳐 서블릿 내장 톰캣 연결
        context.addServletMappingDecoded("/","dispatcherServlet");  // 서블랫 매핑

        tomcat.start();
    }
}
