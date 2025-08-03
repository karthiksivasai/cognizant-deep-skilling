import React from 'react';

const CourseDetails = ({ courses, showCourses }) => {
  // Conditional rendering using switch-like pattern
  const renderContent = () => {
    if (!showCourses) {
      return <p>Courses are not available</p>;
    }
    
    if (courses.length === 0) {
      return <p>No courses available</p>;
    }
    
    return (
      <ul>
        {courses.map((course) => (
          <div key={course.id}>
            <h3>{course.name}</h3>
            <h4>{course.date}</h4>
          </div>
        ))}
      </ul>
    );
  };

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {renderContent()}
    </div>
  );
};

export default CourseDetails; 