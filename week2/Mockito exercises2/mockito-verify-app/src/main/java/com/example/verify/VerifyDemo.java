package com.example.verify;

public class VerifyDemo {
    
    static class FakeApi implements ExternalApi {
        private int getCount = 0;
        private int saveCount = 0;
        private String lastData = null;
        
        public String getData() {
            getCount++;
            return "fake data";
        }
        
        public void saveData(String data) {
            saveCount++;
            lastData = data;
        }
        
        public void showCalls() {
            System.out.println("getData called " + getCount + " times");
            System.out.println("saveData called " + saveCount + " times");
            if (lastData != null) {
                System.out.println("Last saved: " + lastData);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Testing my method calls");
        
        System.out.println("\nTest 1: fetchData calls getData");
        FakeApi api1 = new FakeApi();
        MyService service1 = new MyService(api1);
        service1.fetchData();
        api1.showCalls();
        
        System.out.println("\nTest 2: processData calls saveData");
        FakeApi api2 = new FakeApi();
        MyService service2 = new MyService(api2);
        service2.processData("hello");
        api2.showCalls();
        
        System.out.println("\nTest 3: fetchAndSave calls both");
        FakeApi api3 = new FakeApi();
        MyService service3 = new MyService(api3);
        service3.fetchAndSave();
        api3.showCalls();
        
        System.out.println("\nTest 4: calling twice");
        FakeApi api4 = new FakeApi();
        MyService service4 = new MyService(api4);
        service4.fetchData();
        service4.fetchData();
        api4.showCalls();
        
        System.out.println("\nDone testing");
    }
} 