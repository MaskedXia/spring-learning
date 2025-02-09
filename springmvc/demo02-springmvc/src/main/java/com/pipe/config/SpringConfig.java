package com.pipe.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//实际应用需要和SpringMVCConfig放在不同位置，防止相互扫描

@Configuration
//@ComponentScan({"com.pipe.dao", "com.pipe.service"})
@ComponentScan(value = "com.pipe"
        , excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = Controller.class // exclude Controller and Service classes from scanning
)
)
public class SpringConfig {
}
