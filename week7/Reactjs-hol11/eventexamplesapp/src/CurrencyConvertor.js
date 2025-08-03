import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    
    if (amount && currency) {
      // Conversion rate: 1 Euro = 80 Rupees (approximate)
      const conversionRate = 80;
      const convertedAmount = parseFloat(amount) * conversionRate;
      
      alert(`Converting to ${currency} Amount is ${convertedAmount}`);
    } else {
      alert('Please enter both amount and currency');
    }
  };

  return (
    <div style={{ 
      marginTop: '30px', 
      padding: '20px', 
      border: '2px solid #4CAF50', 
      borderRadius: '8px',
      backgroundColor: '#f0f8f0'
    }}>
      <h1 style={{ color: '#4CAF50', marginBottom: '20px' }}>Currency Convertor!!!</h1>
      
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '15px' }}>
          <label style={{ display: 'block', marginBottom: '5px', fontWeight: 'bold' }}>
            Amount:
          </label>
          <input
            type="number"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
            style={{
              padding: '8px',
              border: '1px solid #ccc',
              borderRadius: '4px',
              width: '200px'
            }}
            placeholder="Enter amount"
          />
        </div>
        
        <div style={{ marginBottom: '15px' }}>
          <label style={{ display: 'block', marginBottom: '5px', fontWeight: 'bold' }}>
            Currency:
          </label>
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
            style={{
              padding: '8px',
              border: '1px solid #ccc',
              borderRadius: '4px',
              width: '200px'
            }}
            placeholder="Enter currency (e.g., Euro)"
          />
        </div>
        
        <button
          type="submit"
          style={{
            padding: '10px 20px',
            backgroundColor: '#4CAF50',
            color: 'white',
            border: 'none',
            borderRadius: '4px',
            cursor: 'pointer',
            fontSize: '16px'
          }}
        >
          Submit
        </button>
      </form>
    </div>
  );
};

export default CurrencyConvertor; 