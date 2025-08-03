import React, { Component } from 'react';

class CountPeople extends Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0,
      c: 0
    };
  }

  updateEntry = () => {
    this.setState((prevState, props) => {
      return { entrycount: prevState.entrycount + 1 };
    });
  };

  updateExit = () => {
    this.setState((prevState, props) => {
      return { exitcount: prevState.exitcount + 1 };
    });
  };

  render() {
    return (
      <div style={{ textAlign: 'center', marginTop: '50px' }}>
        <div style={{ display: 'flex', justifyContent: 'center', gap: '20px' }}>
          <div style={{ 
            backgroundColor: 'green', 
            color: 'white', 
            padding: '20px', 
            borderRadius: '5px',
            minWidth: '200px'
          }}>
            <button 
              onClick={this.updateEntry}
              style={{ 
                backgroundColor: 'green', 
                color: 'white', 
                border: 'none', 
                fontSize: '16px',
                cursor: 'pointer'
              }}
            >
              Login {this.state.entrycount} People Entered!!!
            </button>
          </div>
          
          <div style={{ 
            backgroundColor: 'green', 
            color: 'white', 
            padding: '20px', 
            borderRadius: '5px',
            minWidth: '200px'
          }}>
            <button 
              onClick={this.updateExit}
              style={{ 
                backgroundColor: 'green', 
                color: 'white', 
                border: 'none', 
                fontSize: '16px',
                cursor: 'pointer'
              }}
            >
              Exit {this.state.exitcount} People Left!!!
            </button>
          </div>
        </div>
      </div>
    );
  }
}

export default CountPeople; 