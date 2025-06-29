package com.example.mockito;

public class MyService {
    private ExternalApi api;
    
    public MyService(ExternalApi api) {
        this.api = api;
    }
    
    public String fetchData() {
        String result = api.getData();
        String output = "Processed: " + result;
        return output;
    }
} 