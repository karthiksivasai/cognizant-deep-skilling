# Ticket Booking App - React Conditional Rendering Lab

## Objectives

This hands-on lab demonstrates:
- Conditional rendering in React applications
- Element variables and state management
- Preventing components from rendering based on conditions
- Implementing login/logout functionality with different user experiences

## Application Screenshots

### Guest User View
![Guest View](Screenshot%202025-08-03%20at%203.08.13%20PM.png)

*Guest users see "Please sign up" and can browse flights without booking capability*

### Logged-in User View  
![User View](Screenshot%202025-08-03%20at%203.08.32%20PM.png)

*Logged-in users see "Welcome back" and can book tickets for available flights*

**Note**: Screenshots are available in the project directory. If they don't display in the preview, please check the image files directly.

## Features

### Guest User Experience
- Browse available flights without booking capability
- View flight details (flight number, route, timing, price)
- Clear indication that login is required to book tickets
- "Please sign up" message displayed

### Logged-in User Experience
- Full access to book tickets for available flights
- View and manage bookings
- Cancel existing bookings
- "Welcome back" message displayed
- Booking confirmation alerts

## Components Structure

1. **App.js** - Main component with conditional rendering logic
2. **LoginButton.js** - Simple button component for login action
3. **LogoutButton.js** - Simple button component for logout action
4. **GuestPage.js** - Displays flight browsing interface for guests
5. **UserPage.js** - Displays booking interface for logged-in users

## Conditional Rendering Examples

### Element Variables
```javascript
const isLoggedIn = props.isLoggedIn;
if (isLoggedIn) {
  return <UserGreeting />;
}
return <GuestGreeting />;
```

### Inline Conditional Rendering
```javascript
{isLoggedIn ? <LogoutButton onClick={handleLogout} /> : <LoginButton onClick={handleLogin} />}
```

### Conditional Component Rendering
```javascript
{isLoggedIn ? <UserPage /> : <GuestPage />}
```

## How to Run

1. Navigate to the project directory:
   ```bash
   cd ticketbookingapp
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the development server:
   ```bash
   npm start
   ```

4. Open [http://localhost:3000](http://localhost:3000) in your browser

## Usage

1. **Initial State**: The app starts with guest user view showing "Please sign up"
2. **Login**: Click the "Login" button to switch to user view
3. **Browse Flights**: View available flights with details
4. **Book Tickets**: Logged-in users can book flights (only available after login)
5. **Manage Bookings**: View and cancel booked flights
6. **Logout**: Click "Logout" to return to guest view

## Key Learning Points

- **Conditional Rendering**: Using ternary operators and if statements to show different content
- **State Management**: Using React hooks (useState) to manage login state
- **Component Composition**: Breaking down UI into reusable components
- **User Experience**: Different interfaces for different user types
- **Event Handling**: Managing user interactions with buttons and forms

## Technologies Used

- React 18
- React Hooks (useState)
- CSS3 with modern styling
- Responsive design principles
