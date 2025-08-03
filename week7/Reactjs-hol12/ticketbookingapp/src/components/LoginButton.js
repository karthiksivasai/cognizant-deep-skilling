import React from 'react';

function LoginButton(props) {
  return (
    <button onClick={props.onClick} className="login-btn">
      Login
    </button>
  );
}

export default LoginButton; 