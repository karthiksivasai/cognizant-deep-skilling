package com.cognizant.spring_learn.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "countries")
public class CountryList {
    
    @JacksonXmlProperty(localName = "country")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Country> countries;
    
    public CountryList() {
    }
    
    public CountryList(List<Country> countries) {
        this.countries = countries;
    }
    
    public List<Country> getCountries() {
        return countries;
    }
    
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
} 