package com.justpz.sda.hiernateg6.mongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface Postrepository extends MongoRepository<Post, String> {

    List<Post> findByMessage(String message);

    @Query("{'message' : ?0}")
    List<Post> find(String name);


}
