package com.example.mockito;

public class MockDemo {
    
    static class FakeApi implements ExternalApi {
        public String getData() {
            return "Mock Data";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Testing my service with fake data");
        
        FakeApi api = new FakeApi();
        MyService service = new MyService(api);
        
        String answer = service.fetchData();
        String expected = "Processed: Mock Data";
        
        System.out.println("Expected: " + expected);
        System.out.println("Got: " + answer);
        
        if (answer.equals(expected)) {
            System.out.println("SUCCESS - Mock test passed!");
        } else {
            System.out.println("FAILED - Mock test failed!");
        }
        
        System.out.println("Done with mock testing");
    }
} 