package hello.container;

import hello.spring.HelloConfig;
import hello.spring.HelloController;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitV2Spring implements AppInit {
    @Override
    public void onStartUp(ServletContext servletContext) {
        System.out.println("AppInitV2Spring.onStartUp");

        // 스프링 컨테이너
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(HelloConfig.class);

        // MVC 디스패처 서블릿 생성 , 컨테이너 연결
        DispatcherServlet ds = new DispatcherServlet(ac);
        // 디스패처 서블릿을 서블릿 컨테이너에 등록
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcherV2", ds);// 서블랫 등록
        // 스프링 하위 주소 전부 등록
        servlet.addMapping("/spring/*");
    }
}
