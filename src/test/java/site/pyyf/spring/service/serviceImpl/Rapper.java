package site.pyyf.spring.service.serviceImpl;


import site.pyyf.spring.bean.Component;
import site.pyyf.spring.service.Rap;

@Component
public class Rapper implements Rap {
    public void rap() {
        System.out.println("CXK rapping...");
    }
}
