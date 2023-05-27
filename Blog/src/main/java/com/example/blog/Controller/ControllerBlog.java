package com.example.blog.Controller;

import com.example.blog.Model.Blog;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/blog")
@RequiredArgsConstructor
@Service
public class ControllerBlog {
    private final BlogService blogService;

    @GetMapping("/get")
    public ResponseEntity getAllBlog(){
        List<Blog> blogList = blogService. getAllBlog();
        return ResponseEntity.status(200).body(blogList);
    }
    @PostMapping("/add")
    public ResponseEntity addAll(@Valid @RequestBody Blog blog){
        if (errors.hasErrors()){
            String message=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(HttpStatus.OK).body(message);
        }
        blogService.addBlog(blog);
        return ResponseEntity.status(200).body("Blog added");
    }
    @PutMapping("update/{id}")
    public ResponseEntity uptadeBlog(@Valid @RequestBody Blog blog,@PathVariable Integer id Errors errors) {

        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
        }
        boolean isUpdate = BlogService.uptadeCoffee(id, blog);
        if (isUpdate) {
            return ResponseEntity.status(200).body("Blog update");


        }

        @DeleteMapping("/delete/(id}")
        public ResponseEntity deleteBlog(@Valid @PathVariable Blog blog){
            ResponseEntity.deleteBlog(id ,Blog);
            if (idDelete) {
                return ResponseEntity.status(200).body("Blog delete");
                return new ResponseEntity<>(HttpStatusCode.OK);
            }
            @GetMapping("/get-id/(id)")
            public ResponseEntity getBlogById(@PathVariable Integer id){
                Coffee coffee=coffeeService.findCoffeeById(id);
                return ResponseEntity.status(200).body(coffee);
            }


}
