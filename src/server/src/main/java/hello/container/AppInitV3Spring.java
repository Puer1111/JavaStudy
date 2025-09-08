package hello.container;

// 이제 초기화 하는 과정 좀더 간결화 시키자

import hello.spring.HelloConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitV3Spring implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("APpInitV3Spring.onStartup");


        // 스프링 컨테이너
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(HelloConfig.class);

        // MVC 디스패처 서블릿 생성 , 컨테이너 연결
        DispatcherServlet ds = new DispatcherServlet(ac);
        // 디스패처 서블릿을 서블릿 컨테이너에 등록
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcherV3", ds);// 서블랫 등록

        // 모든 요청 등록
        servlet.addMapping("/");
    }
}
