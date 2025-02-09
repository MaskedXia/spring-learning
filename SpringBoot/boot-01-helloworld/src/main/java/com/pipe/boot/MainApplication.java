package com.pipe.boot;

import com.pipe.boot.bean.Pet;
import com.pipe.boot.bean.User;
import com.pipe.boot.config.Myconfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Pet pet001 = run.getBean("Pet001", Pet.class);
        Pet pet002 = run.getBean("Pet001", Pet.class);
        System.out.println("组件： " + (pet001 == pet002));  //true，默认单例

        Myconfig bean = run.getBean(Myconfig.class);
        System.out.println(bean);

        //代理对象调用容器，proxyBeanMethods = true（默认），单实例
        User user01 = bean.user01();
        User user02 = bean.user01();
        System.out.println(user01 == user02);

    }
}
