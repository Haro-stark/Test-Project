package com.example.Test.Project.util;

import com.example.Test.Project.HttpServletRequestInformation;

import javax.servlet.http.HttpServletRequest;

public class ServletRequestInfoUtil {
    public static HttpServletRequestInformation getRequestInfo(HttpServletRequest request){
        HttpServletRequestInformation reqInfo = new HttpServletRequestInformation();
        reqInfo.setMethodType(request.getMethod());
        reqInfo.setContentType(request.getContentType());
        reqInfo.setClientRemoteIpAddress(request.getRemoteAddr());
        reqInfo.setClientRemoteHostname(request.getRemoteHost());
        reqInfo.setContentLength(request.getContentLength());

        reqInfo.setClientRealIpAddress((String) request.getAttribute("x-forwarded-for"));
        reqInfo.setClientRealHostname((String) request.getAttribute("x-forwarded-host"));

        reqInfo.setClientDeviceType(UserAgentUtil.getClientDeviceType(request));
        reqInfo.setClientOperatingSystem(UserAgentUtil.getClientOperatingSystem(request));
        reqInfo.setClientBrowser(UserAgentUtil.getClientBrowser(request));

        return reqInfo;
    }
}
