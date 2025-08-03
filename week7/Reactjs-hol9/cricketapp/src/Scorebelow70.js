import React from 'react';

const Scorebelow70 = ({ players }) => {
  const players70 = [];
  
  players.map((item) => {
    if (item.score <= 70) {
      players70.push(item);
    }
  });

  return (
    <div>
      <ul>
        {players70.map((item) => (
          <li key={item.name}>
            Mr. {item.name} <span>{item.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Scorebelow70; 