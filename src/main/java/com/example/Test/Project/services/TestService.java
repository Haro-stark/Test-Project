package com.example.Test.Project.services;

import com.example.Test.Project.HttpServletRequestInformation;
import com.example.Test.Project.util.ServletRequestInfoUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Service
public class TestService {

    public HttpServletRequestInformation checkServletRequestAttributeValues(HttpServletRequest request){
        return ServletRequestInfoUtil.getRequestInfo(request);
    }

    public Object checkServletRequestParams(HttpServletRequest request){
        Map<String, String[]> result = new HashMap<>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerKey = (String) headerNames.nextElement();
            String headerValue = request.getHeader(headerKey);
            System.out.println(headerKey+" : "+headerValue);
        }

        System.out.println("ip address: " + request.getRemoteAddr());

        System.out.println("\n\n\t\t-------PRINTING PARAMETERS THROUGH MAP NOW-------\n");
        result = request.getParameterMap();
        result.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        return result;
    }
}
