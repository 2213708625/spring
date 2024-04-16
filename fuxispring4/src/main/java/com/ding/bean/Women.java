package com.ding.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: com.ding.bean
 * @className: Women
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/8/17 20:42
 * @version: 1.0
 */
@Component
public class Women {
    @Value("67")
    private String name;

    @Override
    public String toString() {
        return "Women{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Women() {
    }

    public Women(String name) {
        this.name = name;
    }
}
