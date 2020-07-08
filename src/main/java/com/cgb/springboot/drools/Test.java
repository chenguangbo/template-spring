package com.cgb.springboot.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Test {

    public static void main(String[] args) {
        new Test().t1();
    }

    public void t2() {
        KieServices kieServices = KieServices.Factory.get();
        //获得Kie容器对象
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        //从Kie容器对象中获取会话对象
        KieSession session = kieContainer.newKieSession();
    }

    public void  t1(){
        KieServices kieServices = KieServices.Factory.get();

        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        //会话对象，用于和规则引擎交互
        KieSession kieSession = kieClasspathContainer.newKieSession();
        //将数据提供给规则引擎，规则引擎会根据提供的数据进行规则匹配
        kieSession.insert(10);
        //激活规则引擎，如果规则匹配成功则执行规则
        kieSession.fireAllRules();
        //关闭会话
        kieSession.dispose();

    }
}
