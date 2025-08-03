import React from 'react';
import './App.css';

function App() {
  // Office space data array
  const officeSpaces = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "TCS", Rent: 75000, Address: "Bangalore" },
    { Name: "Infosys", Rent: 45000, Address: "Mumbai" },
    { Name: "Wipro", Rent: 80000, Address: "Delhi" },
    { Name: "HCL", Rent: 55000, Address: "Hyderabad" }
  ];

  // JSX element for heading
  const element = "Office Space";
  
  // JSX attribute for image (using a placeholder image)
  const jsxatt = <img 
    src="https://images.unsplash.com/photo-1497366216548-37526070297c?w=400&h=300&fit=crop" 
    width="25%" 
    height="25%" 
    alt="Office Space"
    style={{ borderRadius: '8px', marginBottom: '20px' }}
  />;

  // Function to determine rent color based on amount
  const getRentColor = (rent) => {
    let colors = [];
    if (rent <= 60000) {
      colors.push('textRed');
    } else {
      colors.push('textGreen');
    }
    return colors[0];
  };

  return (
    <div className="App" style={{ padding: '20px', textAlign: 'center' }}>
      {/* JSX element to display the heading */}
      <h1>{element}, at Affordable Range</h1>
      
      {/* JSX attribute to display the image */}
      {jsxatt}
      
      {/* Loop through office spaces to display data */}
      {officeSpaces.map((office, index) => (
        <div key={index} style={{ 
          border: '1px solid #ddd', 
          borderRadius: '8px', 
          padding: '20px', 
          margin: '10px 0',
          backgroundColor: '#f9f9f9'
        }}>
          {/* Object properties displayed using JSX */}
          <h2>Name: {office.Name}</h2>
          <h3 style={{ 
            color: office.Rent <= 60000 ? 'red' : 'green',
            fontWeight: 'bold'
          }}>
            Rent: Rs. {office.Rent}
          </h3>
          <h3>Address: {office.Address}</h3>
        </div>
      ))}
    </div>
  );
}

export default App;
