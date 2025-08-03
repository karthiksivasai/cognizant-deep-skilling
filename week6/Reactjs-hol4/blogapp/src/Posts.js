import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      posts: []
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const posts = data.map(post => new Post(post.id, post.title, post.body));
        this.setState({ posts: posts });
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
        alert('Error loading posts: ' + error.message);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('Error in Posts component: ' + error.message);
    console.error('Error info:', info);
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts; 