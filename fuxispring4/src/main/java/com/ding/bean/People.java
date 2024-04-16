package com.ding.bean;

/**
 * @projectName: spring
 * @package: com.ding.bean
 * @className: People
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/8/17 20:10
 * @version: 1.0
 */
public class People {
    private User user;

    @Override
    public String toString() {
        return "People{" +
                "user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public People() {
    }

    public People(User user) {
        this.user = user;
    }
}
