package com.example.verify;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    
    @Test
    public void testFetchDataCallsGetData() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("test data");
        
        MyService myService = new MyService(mockApi);
        myService.fetchData();
        
        verify(mockApi).getData();
    }
    
    @Test
    public void testProcessDataCallsSaveData() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        MyService myService = new MyService(mockApi);
        myService.processData("hello");
        
        verify(mockApi).saveData("Processed: hello");
    }
    
    @Test
    public void testFetchAndSaveCallsBothMethods() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("some data");
        
        MyService myService = new MyService(mockApi);
        myService.fetchAndSave();
        
        verify(mockApi, times(1)).getData();
        verify(mockApi, times(1)).saveData("some data");
    }
    
    @Test
    public void testMultipleCalls() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("data");
        
        MyService myService = new MyService(mockApi);
        myService.fetchData();
        myService.fetchData();
        
        verify(mockApi, times(2)).getData();
    }
} 