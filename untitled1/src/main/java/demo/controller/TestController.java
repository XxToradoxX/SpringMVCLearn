package demo.controller;

import demo.pojo.Demo;
import netscape.javascript.JSObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String ttst1(){
        return "hello";
    }
    @RequestMapping("/ttst2")
//    @ResponseBody
    public Demo ttst2(){

//        String str = "{'age':'18','name':'ll'}";
        return new Demo("lhh",18);
//        return str;
    }
}
