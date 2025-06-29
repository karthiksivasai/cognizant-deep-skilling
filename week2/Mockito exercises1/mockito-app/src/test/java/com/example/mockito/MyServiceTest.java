package com.example.mockito;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MyServiceTest {
    
    @Test
    public void testFetchData() {
        ExternalApi fakeApi = Mockito.mock(ExternalApi.class);
        
        when(fakeApi.getData()).thenReturn("Mock Data");
        
        MyService myService = new MyService(fakeApi);
        String answer = myService.fetchData();
        
        String expected = "Processed: Mock Data";
        assertEquals(expected, answer);
    }
} 