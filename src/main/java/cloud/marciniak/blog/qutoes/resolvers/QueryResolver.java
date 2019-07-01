package cloud.marciniak.blog.qutoes.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;

import cloud.marciniak.blog.qutoes.controllers.AuthorController;
import cloud.marciniak.blog.qutoes.controllers.QuoteController;
import cloud.marciniak.blog.qutoes.models.Author;
import cloud.marciniak.blog.qutoes.models.Quote;

public class QueryResolver implements GraphQLQueryResolver {
    
    @Autowired
    QuoteController quoteController;
    @Autowired
    AuthorController authorController;

    public Quote findQuoteById(String id) {
        return quoteController.findQuoteById(id);
    }

    public Author findAuthorById(String id) {
        return authorController.findAuthorById(id);
    }

    public List<Quote> getAllQuotes() {
        return quoteController.getAllQuotes();
    }

    public List<Author> getAllAuthors() {
        return authorController.getAllAuthors();
    }
}