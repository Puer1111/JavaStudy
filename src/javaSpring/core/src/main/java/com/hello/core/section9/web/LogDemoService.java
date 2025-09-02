package com.hello.core.section9.web;

import com.hello.core.common.section9.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    //    private final MyLogger myLogger;
    private final ObjectProvider<MyLogger> myLoggerProvider;

    public void logic(String Id) {
        MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.log("Service id = " + Id);
    }
}
