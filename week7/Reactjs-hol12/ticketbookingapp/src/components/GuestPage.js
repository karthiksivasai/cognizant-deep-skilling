import React from 'react';

function GuestPage() {
  const flights = [
    {
      id: 1,
      flightNumber: 'AI101',
      from: 'Mumbai',
      to: 'Delhi',
      departure: '10:00 AM',
      arrival: '12:00 PM',
      price: '₹5,000'
    },
    {
      id: 2,
      flightNumber: 'AI102',
      from: 'Delhi',
      to: 'Bangalore',
      departure: '02:00 PM',
      arrival: '04:30 PM',
      price: '₹7,500'
    },
    {
      id: 3,
      flightNumber: 'AI103',
      from: 'Chennai',
      to: 'Kolkata',
      departure: '06:00 AM',
      arrival: '08:00 AM',
      price: '₹4,500'
    }
  ];

  return (
    <div className="guest-page">
      <h2>Please sign up</h2>
      <p>Browse available flights below. Login to book tickets.</p>
      
      <div className="flights-container">
        <h3>Available Flights</h3>
        <div className="flights-grid">
          {flights.map(flight => (
            <div key={flight.id} className="flight-card">
              <h4>Flight {flight.flightNumber}</h4>
              <div className="flight-details">
                <p><strong>From:</strong> {flight.from}</p>
                <p><strong>To:</strong> {flight.to}</p>
                <p><strong>Departure:</strong> {flight.departure}</p>
                <p><strong>Arrival:</strong> {flight.arrival}</p>
                <p><strong>Price:</strong> {flight.price}</p>
              </div>
              <div className="booking-notice">
                <p>Login required to book this flight</p>
              </div>
            </div>
          ))}
        </div>
      </div>
    </div>
  );
}

export default GuestPage; 