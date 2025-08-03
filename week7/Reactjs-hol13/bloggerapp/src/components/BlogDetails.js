import React from 'react';

const BlogDetails = ({ blogs, showBlogs }) => {
  // Conditional rendering using logical AND operator
  const content = showBlogs && (
    <ul>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </ul>
  );

  // Conditional rendering using ternary operator
  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {showBlogs ? content : <p>Blogs are not available</p>}
    </div>
  );
};

export default BlogDetails; 