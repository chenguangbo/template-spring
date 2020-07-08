package com.cgb.springboot.sdk.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by ${陈广波} on 2020/5/22.
 */
@Component
@ConfigurationProperties(prefix = "person")
//@Setter
//@Getter
//@ToString
public class Person {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
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
}
