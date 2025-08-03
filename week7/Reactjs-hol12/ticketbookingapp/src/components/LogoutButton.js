import React from 'react';

function LogoutButton(props) {
  return (
    <button onClick={props.onClick} className="logout-btn">
      Logout
    </button>
  );
}

export default LogoutButton; 