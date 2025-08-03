import React from 'react';

const BookDetails = ({ books, showBooks }) => {
  // Conditional rendering using if/else
  if (!showBooks) {
    return <div className="st2"><h1>Book Details</h1><p>Books are not available</p></div>;
  }

  // Using map function to render multiple components
  const bookdet = (
    <ul>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  // Conditional rendering using ternary operator
  return (
    <div className="st2">
      <h1>Book Details</h1>
      {books.length > 0 ? bookdet : <p>No books available</p>}
    </div>
  );
};

export default BookDetails; 