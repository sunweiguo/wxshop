package com.swg.missyou.core.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author swg.
 * @Date 2020/6/27 16:12
 * @CONTACT 317758022@qq.com
 * @DESC 读取exception-code.properties配置文件，放入Map数据结构中
 */
@Data
@Component
@ConfigurationProperties(prefix = "fossi")
@PropertySource(value = "classpath:config/exception-code.properties")
public class ExceptionCodeConfiguration {

    private Map<Integer ,String> codes = new HashMap<>();

    public String getMessage(int code){
        return codes.get(code);
    }
}
