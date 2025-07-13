package com.cognizant.spring_learn.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Country {
    @JacksonXmlProperty(isAttribute = true)
    private String code;
    
    @JacksonXmlProperty(isAttribute = true)
    private String name;
    
    public Country() {
    }
    
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
} 