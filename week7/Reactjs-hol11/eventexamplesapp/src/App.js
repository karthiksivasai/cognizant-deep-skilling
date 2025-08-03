import React, { useState } from 'react';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [counter, setCounter] = useState(5);

  // 1. Increment button with multiple methods
  const handleIncrement = () => {
    setCounter(counter + 1);
    alert('Hello! Member!');
  };

  // 2. Decrement button
  const handleDecrement = () => {
    setCounter(counter - 1);
  };

  // 3. Say welcome button with argument
  const handleSayWelcome = (message) => {
    alert(message);
  };

  // 4. Synthetic event OnPress
  const handleOnPress = () => {
    alert('I was clicked');
  };

  return (
    <div className="App" style={{ padding: '20px', textAlign: 'center' }}>
      {/* Event Handling Examples Section */}
      <div style={{ 
        marginBottom: '30px', 
        padding: '20px', 
        border: '2px solid #2196F3', 
        borderRadius: '8px',
        backgroundColor: '#f0f8ff'
      }}>
        <h2 style={{ color: '#2196F3', marginBottom: '20px' }}>Event Handling Examples</h2>
        
        {/* Counter Display */}
        <div style={{ 
          fontSize: '48px', 
          fontWeight: 'bold', 
          color: '#333',
          marginBottom: '20px'
        }}>
          {counter}
        </div>
        
        {/* Buttons */}
        <div style={{ display: 'flex', flexDirection: 'column', gap: '10px', alignItems: 'center' }}>
          <button
            onClick={handleIncrement}
            style={{
              padding: '10px 20px',
              backgroundColor: '#4CAF50',
              color: 'white',
              border: 'none',
              borderRadius: '4px',
              cursor: 'pointer',
              fontSize: '16px',
              width: '150px'
            }}
          >
            Increment
          </button>
          
          <button
            onClick={handleDecrement}
            style={{
              padding: '10px 20px',
              backgroundColor: '#f44336',
              color: 'white',
              border: 'none',
              borderRadius: '4px',
              cursor: 'pointer',
              fontSize: '16px',
              width: '150px'
            }}
          >
            Decrement
          </button>
          
          <button
            onClick={() => handleSayWelcome('welcome')}
            style={{
              padding: '10px 20px',
              backgroundColor: '#FF9800',
              color: 'white',
              border: 'none',
              borderRadius: '4px',
              cursor: 'pointer',
              fontSize: '16px',
              width: '150px'
            }}
          >
            Say welcome
          </button>
          
          <button
            onClick={handleOnPress}
            style={{
              padding: '10px 20px',
              backgroundColor: '#9C27B0',
              color: 'white',
              border: 'none',
              borderRadius: '4px',
              cursor: 'pointer',
              fontSize: '16px',
              width: '150px'
            }}
          >
            Click on me
          </button>
        </div>
      </div>
      
      {/* Currency Convertor Component */}
      <CurrencyConvertor />
    </div>
  );
}

export default App;
