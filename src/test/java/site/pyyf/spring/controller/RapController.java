package site.pyyf.spring.controller;


import site.pyyf.spring.bean.AutoWired;
import site.pyyf.spring.service.Rap;
import site.pyyf.spring.web.mvc.Controller;
import site.pyyf.spring.web.mvc.RequestMapping;

@Controller
public class RapController {
    @AutoWired
    private Rap rapper;

    @RequestMapping("/rap")
    public String rap() {
        rapper.rap();
        return "CXK";
    }
}