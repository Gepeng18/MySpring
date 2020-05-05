package site.pyyf.spring.starter;


import site.pyyf.spring.bean.BeanFactory;
import site.pyyf.spring.core.ClassScanner;
import site.pyyf.spring.web.handler.HandlerManager;
import site.pyyf.spring.web.server.TomcatServer;

import java.util.List;

public class MiniApplication {
    public static void run(Class<?> cls, String[] args) {
        TomcatServer tomcatServer = new TomcatServer(args);
        try {
            // 启动 tomcat 服务
            tomcatServer.startServer();
            // 扫描类
            List<Class<?>> classList = ClassScanner.scannerCLasses(cls.getPackage().getName());
            // 初始化 Bean 工厂,初始化 AOP，这里使用了 JDK 动态代理，
            // Bean工厂第一次初始化后，使用代理类的对象来覆盖 Bean 工厂中的对应对象
            BeanFactory.initBean(classList);
            // Handler 管理器实例化所有的映射处理器，并绑定到类
            HandlerManager.resolveMappingHandler(classList);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
