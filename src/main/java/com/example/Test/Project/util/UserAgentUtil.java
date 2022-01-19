package com.example.Test.Project.util;

import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;

import javax.servlet.http.HttpServletRequest;

public class UserAgentUtil {
    public static String getClientBrowser(HttpServletRequest request){
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        String browser = userAgent.getBrowser().getName();
        return browser;
    }
    public static String getClientOperatingSystem(HttpServletRequest request){
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        String os = userAgent.getOperatingSystem().getName();
        return os;
    }
    public static String getClientDeviceType(HttpServletRequest request){
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        String device = userAgent.getOperatingSystem().getDeviceType().getName();
        return device;
    }

}
