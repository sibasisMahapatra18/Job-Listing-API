package dev.sibasis.Joblisting.Repository;

import java.util.List;

import dev.sibasis.Joblisting.model.Post;

public interface SearchRepository {
  List<Post> findByText(String text);
}
