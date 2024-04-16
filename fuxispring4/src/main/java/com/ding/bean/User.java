package com.ding.bean;

import java.util.*;

/**
 * @projectName: spring
 * @package: com.ding.bean
 * @className: User
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/8/17 20:04
 * @version: 1.0
 */
public class User {
    private String username;
    private String password;
    private int[] aihaos;
    private List names;
    private Set values;
    private Map<Integer,String> meandyou;
    private Properties properties;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", aihaos=" + Arrays.toString(aihaos) +
                ", names=" + names +
                ", values=" + values +
                ", meandyou=" + meandyou +
                ", properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public User(String username, String password, int[] aihaos, List names, Set values, Map<Integer, String> meandyou, Properties properties) {
        this.username = username;
        this.password = password;
        this.aihaos = aihaos;
        this.names = names;
        this.values = values;
        this.meandyou = meandyou;
        this.properties = properties;
    }

    public Map<Integer, String> getMeandyou() {
        return meandyou;
    }

    public void setMeandyou(Map<Integer, String> meandyou) {
        this.meandyou = meandyou;
    }

    public List getNames() {
        return names;
    }

    public void setNames(List names) {
        this.names = names;
    }

    public Set getValues() {
        return values;
    }

    public void setValues(Set values) {
        this.values = values;
    }


    public int[] getAihaos() {
        return aihaos;
    }

    public void setAihaos(int[] aihaos) {
        this.aihaos = aihaos;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }
}
