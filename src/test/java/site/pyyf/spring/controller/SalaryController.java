package site.pyyf.spring.controller;


import site.pyyf.spring.bean.AutoWired;
import site.pyyf.spring.service.serviceImpl.SalaryService;
import site.pyyf.spring.web.mvc.Controller;
import site.pyyf.spring.web.mvc.RequestMapping;
import site.pyyf.spring.web.mvc.RequestParam;

/**
 * @author:czwbig
 * @date:2019/7/6 16:48
 * @description:
 */
@Controller
public class SalaryController {
    @AutoWired
    private SalaryService salaryService;

    @RequestMapping("/getSalary")
    public Integer getSalary(@RequestParam("name") String name, @RequestParam("experience") String experience) {
        if (experience == null || experience.isEmpty()) {
            return 0;
        }
        return salaryService.calSalary(Integer.parseInt(experience));
    }
}
