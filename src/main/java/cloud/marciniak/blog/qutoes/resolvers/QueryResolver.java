package cloud.marciniak.blog.qutoes.resolvers;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;

import cloud.marciniak.blog.qutoes.controllers.QuoteController;
import cloud.marciniak.blog.qutoes.models.Quote;

public class QueryResolver implements GraphQLQueryResolver {
    
    @Autowired
    QuoteController quoteController;

    public Quote findQuoteById(String id) {
        return quoteController.findQuoteById(id);
    }

    public List<Quote> getAllQuotes() {
        return quoteController.getAllQuotes();
    }
}