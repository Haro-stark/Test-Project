package com.example.Test.Project.controllers;

import com.example.Test.Project.HttpServletRequestInformation;
import com.example.Test.Project.services.TestService;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public HttpServletRequestInformation checkServletRequestAttributeValues(HttpServletRequest request, @RequestParam String key){
        return testService.checkServletRequestAttributeValues(request);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/post")
    @ResponseBody
    public Object checkServletRequestParams(HttpServletRequest request, @RequestParam String key){
        return testService.checkServletRequestParams(request);
    }



}
