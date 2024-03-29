package cloud.marciniak.blog.qutoes.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import cloud.marciniak.blog.qutoes.models.Quote;

public interface QuoteRepository extends MongoRepository<Quote, String> {
    
    List<Quote> findByAuthorId(String authorId);
}