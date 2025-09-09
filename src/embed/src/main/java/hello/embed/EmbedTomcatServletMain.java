package hello.embed;

import hello.servlet.HelloServlet;
import hello.spring.HelloController;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

public class EmbedTomcatServletMain {
    public static void main(String[] args) throws LifecycleException {
        System.out.println("EmbedTomcatServletMain.main");

        // 톰캣 설정
        Tomcat tomcat = new Tomcat();
        Connector connector = new Connector();
        connector.setPort(8080);
        tomcat.setConnector(connector);


        // 서블릿 등록
        Context context = tomcat.addContext("", "/");
        tomcat.addServlet("","helloServlet",new HelloServlet());
        context.addServletMappingDecoded("/hello-servlet","helloServlet");
        tomcat.start();

        // 설정 상 에러로 실행 안됨. 형태만 공부
    }
}
