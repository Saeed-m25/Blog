package com.example.blog.Service;

import com.example.blog.Model.Blog;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceBlog {
    private ServiceBlog serviceBlog;

    public List<Blog> getAllBlog() {
        return blogRepository.findAll();
    }

    public void addBlog(Blog blog) {
        blogRepository.save(blog);
    }

    public Boolean uptadeBlog(Integer id, Blog blog) {
        Blog oldBlogs = blogRepository.getById(id);
        if (oldBlog == null) {
            return false;
        }
        oldBlogs.setId(blog.getId());
        oldBlogs.setCategory(blog.getCategory());
        oldBlogs.setTitle(Blog.getTitle());


        BlogRepository.save(oldBlogs);
        return true;

    }

    public Boolean deleteBlog(Integer id) {
        Blog oldBlog = blogRepository.getById(id);
        if (oldBlog == null) {
            return false;
        }
        blogRepository.delete(oldBlog);
        return true;
    }
}
