package cloud.marciniak.blog.qutoes.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;

import org.springframework.beans.factory.annotation.Autowired;

import cloud.marciniak.blog.qutoes.controllers.AuthorController;
import cloud.marciniak.blog.qutoes.controllers.QuoteController;
import cloud.marciniak.blog.qutoes.models.Author;
import cloud.marciniak.blog.qutoes.models.Quote;

public class QuoteResolver implements GraphQLResolver<Quote> {
    
    @Autowired
    private AuthorController authorController;
    @Autowired
    private QuoteController quoteController;

    public Author getAuthor(Quote quote) {
        return authorController.findAuthorById(quote.getAuthorId());
    }

    public Quote getQuote(String id) {
        return quoteController.findQuoteById(id);
    }
}