package com.hello.core.section9.web;

import com.hello.core.common.section9.MyLogger;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class LogDemoController {
    private final LogDemoService logDemoService;
    private final MyLogger myLogger; // Proxy 에서도 이거로 씀!
//    private final ObjectProvider<MyLogger> myLoggerProvider; // Provider 를 통해 고객 요청 시점을 재현한다. 필요한 빈을 찾을 수 있기 때문! + 이거도 귀찮아서 더 줄이는 방법 -> Proxy


    @RequestMapping("log-demo")
    @ResponseBody
    public String logDemo(HttpServletRequest request) throws InterruptedException {
//        MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.setRequestURL(request.getRequestURL().toString());

        myLogger.log("Controller Test");
        Thread.sleep(1000); // 미리 써보는 쓰레드 : 1초간 지연시켜서 유저가 동시에 접속해도 해당 유저의 ID나 정보가 바뀌지 않고 그대로 진행이 된다는걸 확인할 수 있다.
        logDemoService.logic("testId");

        return "OK";
    }

}
