package dev.sibasis.Joblisting.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.sibasis.Joblisting.model.Post;

public interface PostRepo extends MongoRepository<Post, String>{

}
