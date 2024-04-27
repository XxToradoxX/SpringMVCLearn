package demo.controller;

import demo.pojo.Demo;
import netscape.javascript.JSObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TestController {
    @RequestMapping("/ttst")
    public String ttst1(){
        return "hello";
    }
    @RequestMapping("/ttst2")
    public Demo ttst2(Demo demo){
        System.out.println(demo);
        return demo;
    }
    @RequestMapping("/ttst3")
    public String ttst3(){
        return "{'name'='zhangsan','age'=18}";
    }
    @RequestMapping("/ttst4")
    public String[] ttst4(String[] name){
        System.out.println(Arrays.toString(name));
        return name;
    }
    @RequestMapping("/ttst5")
    public List<String> ttst4(@RequestParam List<String> name){
        System.out.println(name.toString());
        return name;
    }
    @RequestMapping("/ttst6")
    public Map<?,?> ttst6(@RequestBody Map<String,Object>names){
        System.out.println(names);
        return names;
    }
}
