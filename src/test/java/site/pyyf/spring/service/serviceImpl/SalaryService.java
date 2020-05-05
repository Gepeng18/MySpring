package site.pyyf.spring.service.serviceImpl;


import site.pyyf.spring.bean.Component;

/**
 * @author:czwbig
 * @date:2019/7/6 23:59
 * @description:
 */

@Component
public class SalaryService {
    public Integer calSalary(Integer experience) {
        return experience * 666;
    }
}
