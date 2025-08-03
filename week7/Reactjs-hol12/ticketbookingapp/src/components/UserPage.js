import React, { useState } from 'react';

function UserPage() {
  const [bookedFlights, setBookedFlights] = useState([]);

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

  const handleBookFlight = (flight) => {
    if (!bookedFlights.find(booked => booked.id === flight.id)) {
      setBookedFlights([...bookedFlights, flight]);
      alert(`Flight ${flight.flightNumber} booked successfully!`);
    } else {
      alert('Flight already booked!');
    }
  };

  const handleCancelBooking = (flightId) => {
    setBookedFlights(bookedFlights.filter(flight => flight.id !== flightId));
  };

  return (
    <div className="user-page">
      <h2>Welcome back</h2>
      <p>You can now book tickets for available flights.</p>
      
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
              <button 
                onClick={() => handleBookFlight(flight)}
                className="book-btn"
                disabled={bookedFlights.find(booked => booked.id === flight.id)}
              >
                {bookedFlights.find(booked => booked.id === flight.id) ? 'Booked' : 'Book Now'}
              </button>
            </div>
          ))}
        </div>
      </div>

      {bookedFlights.length > 0 && (
        <div className="bookings-container">
          <h3>Your Bookings</h3>
          <div className="bookings-grid">
            {bookedFlights.map(flight => (
              <div key={flight.id} className="booking-card">
                <h4>Flight {flight.flightNumber}</h4>
                <div className="booking-details">
                  <p><strong>From:</strong> {flight.from}</p>
                  <p><strong>To:</strong> {flight.to}</p>
                  <p><strong>Departure:</strong> {flight.departure}</p>
                  <p><strong>Price:</strong> {flight.price}</p>
                </div>
                <button 
                  onClick={() => handleCancelBooking(flight.id)}
                  className="cancel-btn"
                >
                  Cancel Booking
                </button>
              </div>
            ))}
          </div>
        </div>
      )}
    </div>
  );
}

export default UserPage; 