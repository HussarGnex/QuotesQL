package cloud.marciniak.blog.qutoes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cloud.marciniak.blog.qutoes.exceptions.QuoteNotFoundException;
import cloud.marciniak.blog.qutoes.models.Quote;
import cloud.marciniak.blog.qutoes.repositories.QuoteRepository;

@Component
public class QuoteController {

    @Autowired
    private QuoteRepository quoteRepository;

    public Quote findQuoteById(String id) {
        return quoteRepository.findById(id)
            .orElseThrow(() -> new QuoteNotFoundException("Quote not found!", id));
    }

    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    public List<Quote> getAllQuotesByAuthorId(String authorId) {
        return quoteRepository.findByAuthorId(authorId);
    }

    public Quote createQuote(Quote quote) {
        return quoteRepository.save(quote);
    }

    public void deleteQuote(Quote quote) {
        quoteRepository.delete(quote);
    }
}