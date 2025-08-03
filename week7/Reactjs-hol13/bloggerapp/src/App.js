import React, { useState } from 'react';
import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books } from './data/books';
import { blogs } from './data/blogs';
import { courses } from './data/courses';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);
  const [renderMode, setRenderMode] = useState('all');

  // Conditional rendering using element variables
  const renderAllComponents = (
    <div>
      <div>
        <BookDetails books={books} showBooks={showBooks} />
        <BlogDetails blogs={blogs} showBlogs={showBlogs} />
        <CourseDetails courses={courses} showCourses={showCourses} />
      </div>
    </div>
  );

  const renderBooksOnly = <BookDetails books={books} showBooks={showBooks} />;
  const renderBlogsOnly = <BlogDetails blogs={blogs} showBlogs={showBlogs} />;
  const renderCoursesOnly = <CourseDetails courses={courses} showCourses={showCourses} />;

  // Conditional rendering using switch-like pattern
  const renderContent = () => {
    switch (renderMode) {
      case 'books':
        return renderBooksOnly;
      case 'blogs':
        return renderBlogsOnly;
      case 'courses':
        return renderCoursesOnly;
      default:
        return renderAllComponents;
    }
  };

  return (
    <div className="App">
      <header className="App-header">
        <h1>Blogger App - Conditional Rendering Demo</h1>
        
        {/* Conditional rendering using logical AND operator */}
        <div className="controls">
          <h3>Toggle Components:</h3>
          <button onClick={() => setShowBooks(!showBooks)}>
            {showBooks ? 'Hide' : 'Show'} Books
          </button>
          <button onClick={() => setShowBlogs(!showBlogs)}>
            {showBlogs ? 'Hide' : 'Show'} Blogs
          </button>
          <button onClick={() => setShowCourses(!showCourses)}>
            {showCourses ? 'Hide' : 'Show'} Courses
          </button>
        </div>

        {/* Conditional rendering using ternary operator */}
        <div className="render-mode">
          <h3>Render Mode:</h3>
          <button onClick={() => setRenderMode('all')}>
            {renderMode === 'all' ? '✓ All' : 'All'}
          </button>
          <button onClick={() => setRenderMode('books')}>
            {renderMode === 'books' ? '✓ Books' : 'Books'}
          </button>
          <button onClick={() => setRenderMode('blogs')}>
            {renderMode === 'blogs' ? '✓ Blogs' : 'Blogs'}
          </button>
          <button onClick={() => setRenderMode('courses')}>
            {renderMode === 'courses' ? '✓ Courses' : 'Courses'}
          </button>
        </div>
      </header>

      <main>
        {/* Conditional rendering using function call */}
        {renderContent()}
      </main>
    </div>
  );
}

export default App;
