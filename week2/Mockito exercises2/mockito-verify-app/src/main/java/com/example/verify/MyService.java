package com.example.verify;

public class MyService {
    private ExternalApi api;
    
    public MyService(ExternalApi api) {
        this.api = api;
    }
    
    public String fetchData() {
        String data = api.getData();
        return data;
    }
    
    public void processData(String input) {
        String newData = "Processed: " + input;
        api.saveData(newData);
    }
    
    public String fetchAndSave() {
        String info = api.getData();
        api.saveData(info);
        return info;
    }
} 