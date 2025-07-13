package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.model.CountryList;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CountryService {
    
    private List<Country> countries;
    
    public CountryService() {
        loadCountries();
    }
    
    private void loadCountries() {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            ClassPathResource resource = new ClassPathResource("country.xml");
            CountryList countryList = xmlMapper.readValue(resource.getInputStream(), CountryList.class);
            this.countries = countryList.getCountries();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Country getCountry(String code) {
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
} 