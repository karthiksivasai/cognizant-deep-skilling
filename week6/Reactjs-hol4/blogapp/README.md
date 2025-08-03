# Blog App - React Lifecycle Hooks Lab

## Objectives

- Explain the need and Benefits of component lifecycle
- Identify various lifecycle hook methods
- List the sequence of steps in rendering a component

## Project Overview

This React application demonstrates the implementation of lifecycle hooks in a class component. The app showcases:

- **Lifecycle Hooks**: componentDidMount() and componentDidCatch()
- **API Integration**: Fetch API to retrieve posts from JSONPlaceholder
- **Error Handling**: Error boundaries and alert messages
- **State Management**: Component state with posts data
- **Class Components**: Complete lifecycle implementation

## Components

### Post Class
- **File**: `src/Post.js`
- **Type**: JavaScript Class
- **Properties**: `id`, `title`, `body`
- **Purpose**: Data model for blog posts

### Posts Component
- **File**: `src/Posts.js`
- **Type**: Class Component
- **Lifecycle Hooks**: componentDidMount(), componentDidCatch()
- **Methods**: loadPosts(), render()
- **Functionality**: Fetches and displays blog posts

## Project Structure

```
src/
├── Post.js           # Post class definition
├── Posts.js          # Posts component with lifecycle hooks
├── App.js            # Main app component
├── App.css           # Application styles
└── index.js          # Entry point
```

## Key Concepts Demonstrated

- **componentDidMount()**: Called after component mounts, triggers API call
- **componentDidCatch()**: Error boundary for handling component errors
- **Fetch API**: Asynchronous data fetching from external API
- **State Management**: Updating component state with fetched data
- **Error Handling**: Alert messages for user feedback
- **Lifecycle Sequence**: Constructor → componentDidMount → render

## Lifecycle Implementation

### Constructor
- Initializes component state with empty posts array
- Calls super(props) to initialize parent component

### componentDidMount()
- Called after component is mounted to DOM
- Triggers loadPosts() method to fetch data
- Perfect place for API calls and side effects

### loadPosts()
- Uses Fetch API to get posts from JSONPlaceholder
- Converts API data to Post objects
- Updates component state with fetched posts
- Includes error handling with alerts

### componentDidCatch()
- Error boundary method for catching component errors
- Displays alert messages for user feedback
- Logs error information to console

### render()
- Displays blog posts with titles and content
- Maps through posts array to create JSX
- Uses headings for titles and paragraphs for content

## API Integration

- **URL**: https://jsonplaceholder.typicode.com/posts
- **Method**: GET request using Fetch API
- **Data**: Array of posts with id, title, and body
- **Processing**: Converts to Post objects for consistency

## Getting Started

### Prerequisites

- Node.js
- NPM
- Visual Studio Code

### Installation

1. Navigate to the project directory
2. Install dependencies:
   ```bash
   npm install
   ```

### Running the Application

Start the development server:
```bash
npm start
```

Open [http://localhost:3000](http://localhost:3000) to view the application.

## Expected Output

The application will display:
- "Blog Posts" heading
- List of blog posts with titles and content
- Each post displayed with proper styling
- Error alerts if API calls fail

![Blog App Output](blog-app-output.jpeg)

The screenshot shows the successful rendering of the Posts component with lifecycle hooks, displaying blog posts fetched from the JSONPlaceholder API. The clean layout shows titles and content with proper styling and spacing.

## Available Scripts

- `npm start` - Runs the app in development mode
- `npm test` - Launches the test runner
- `npm run build` - Builds the app for production
- `npm run eject` - Ejects from Create React App

## Learn More

- [React Documentation](https://reactjs.org/)
- [React Lifecycle Methods](https://reactjs.org/docs/react-component.html)
- [Fetch API](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API)
- [Error Boundaries](https://reactjs.org/docs/error-boundaries.html)
