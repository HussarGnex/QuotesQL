package cloud.marciniak.blog.qutoes.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;

import org.springframework.beans.factory.annotation.Autowired;

import cloud.marciniak.blog.qutoes.controllers.QuoteController;
import cloud.marciniak.blog.qutoes.models.Author;
import cloud.marciniak.blog.qutoes.models.Quote;

public class AuthorResolver implements GraphQLResolver<Author> {
    
    @Autowired
    private QuoteController quoteController;

    public List<Quote> getQuotes(Author author) {
        return quoteController.getAllQuotesByAuthorId(author.getId());
    }

}