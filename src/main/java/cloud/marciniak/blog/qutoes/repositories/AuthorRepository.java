package cloud.marciniak.blog.qutoes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import cloud.marciniak.blog.qutoes.models.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {
    
}