package dev.sibasis.Joblisting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.sibasis.Joblisting.Repository.PostRepo;
import dev.sibasis.Joblisting.Repository.SearchRepository;
import dev.sibasis.Joblisting.model.Post;

@RestController
public class PostController {

    @Autowired
    PostRepo repo;

    @Autowired
    SearchRepository srepo;
    
    @GetMapping("/posts")
    public List<Post> getAllPosts(){
      
        return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
   return srepo.findByText(text);
    }
    

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
          
         return repo.save(post);

    }




}
