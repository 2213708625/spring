package com.ding.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @projectName: spring
 * @package: com.ding.bean
 * @className: Man
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/8/17 20:39
 * @version: 1.0
 */
@Component
public class Man {
    @Value("dsadjsa")
    private String name;
   @Value("111")
    private Integer age;
   @Autowired
   @Qualifier("women")
   private Women women;

    public Man(String name, Integer age, Women women) {
        this.name = name;
        this.age = age;
        this.women = women;
    }

    public Women getWomen() {
        return women;
    }

    public void setWomen(Women women) {
        this.women = women;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", women=" + women +
                '}';
    }

    public Man() {
    }
}
