# Blogger App - React Conditional Rendering Lab

## Objectives

This hands-on lab demonstrates:
- Various ways of conditional rendering in React
- How to render multiple components
- Defining list components
- Using keys in React applications
- Extracting components with keys
- React Map and map() function

## Application Screenshots

### All Components Displayed
![All Components](all-components.png)

*Shows all three components (Books, Blogs, Courses) displayed simultaneously*

### Components Hidden
![Components Hidden](components-hidden.png)

*Demonstrates conditional rendering when components are toggled off*

### Books Only Mode
![Books Only](books-only.png)

*Shows only the Book Details component with render mode selection*

### Blogs Only Mode
![Blogs Only](blogs-only.png)

*Shows only the Blog Details component with render mode selection*

### Courses Only Mode
![Courses Only](courses-only.png)

*Shows only the Course Details component with render mode selection*

## Features

### Three Main Components:
1. **Book Details** - Displays books with name and price
2. **Blog Details** - Shows blog posts with title, author, and content
3. **Course Details** - Lists courses with name and date

### Conditional Rendering Techniques Demonstrated:

#### 1. **If/Else Statements**
```javascript
if (!showBooks) {
  return <div>Books are not available</div>;
}
```

#### 2. **Ternary Operators**
```javascript
{books.length > 0 ? bookdet : <p>No books available</p>}
```

#### 3. **Logical AND Operator**
```javascript
const content = showBlogs && (
  <ul>{blogs.map(blog => <div key={blog.id}>...</div>)}</ul>
);
```

#### 4. **Element Variables**
```javascript
const renderAllComponents = (
  <div>
    <BookDetails books={books} showBooks={showBooks} />
    <BlogDetails blogs={blogs} showBlogs={showBlogs} />
    <CourseDetails courses={courses} showCourses={showCourses} />
  </div>
);
```

#### 5. **Switch-like Pattern**
```javascript
const renderContent = () => {
  switch (renderMode) {
    case 'books': return renderBooksOnly;
    case 'blogs': return renderBlogsOnly;
    case 'courses': return renderCoursesOnly;
    default: return renderAllComponents;
  }
};
```

#### 6. **Function-based Conditional Rendering**
```javascript
const renderContent = () => {
  if (!showCourses) return <p>Courses are not available</p>;
  if (courses.length === 0) return <p>No courses available</p>;
  return <ul>{courses.map(course => <div key={course.id}>...</div>)}</ul>;
};
```

## Map Function and Keys

### **Map Function Example:**
```javascript
{books.map((book) => (
  <div key={book.id}>
    <h3>{book.bname}</h3>
    <h4>{book.price}</h4>
  </div>
))}
```

### **Keys in React:**
- Each mapped element has a unique `key` prop
- Keys help React identify which items have changed
- Using `book.id`, `blog.id`, and `course.id` as keys

## Components Structure

1. **App.js** - Main component with state management and conditional rendering
2. **BookDetails.js** - Renders book list with conditional display
3. **BlogDetails.js** - Renders blog list with conditional display
4. **CourseDetails.js** - Renders course list with conditional display
5. **Data Files** - Separate files for books, blogs, and courses data

## How to Run

1. Navigate to the project directory:
   ```bash
   cd bloggerapp
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

### **Toggle Components:**
- Click "Hide/Show Books" to toggle book display
- Click "Hide/Show Blogs" to toggle blog display
- Click "Hide/Show Courses" to toggle course display

### **Render Modes:**
- **All** - Shows all three components
- **Books** - Shows only book details
- **Blogs** - Shows only blog details
- **Courses** - Shows only course details

## Key Learning Points

- **Conditional Rendering**: Multiple techniques for showing/hiding components
- **Map Function**: Using `map()` to render lists of components
- **Keys**: Using unique keys for efficient list rendering
- **Component Extraction**: Breaking down UI into reusable components
- **State Management**: Using React hooks to manage component visibility
- **Multiple Rendering Patterns**: Different approaches for conditional rendering

## Technologies Used

- React 18
- React Hooks (useState)
- CSS3 with modern styling
- Responsive design principles
