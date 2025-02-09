package com.pipe.boot.config;

import ch.qos.logback.classic.db.DBHelper;
import com.pipe.boot.bean.Pet;
import com.pipe.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//配置类
@Import({User.class, DBHelper.class})  //给容器自动创建两个类型的组件
@Configuration(proxyBeanMethods = true)
//@ConditionalOnBean(name = "Pet001")  // 条件，容器存在Pet001组件，才运行
//@ImportResource("classpath:beans.xml") //beans.xml导入组件
public class Myconfig {

    @Bean
    public User user01() {
        return new User("li", "123456");
    }

    //修改组件名称
    @Bean("Pet001")
    public Pet pet01()
    {
        return new Pet("dog");
    }
}
