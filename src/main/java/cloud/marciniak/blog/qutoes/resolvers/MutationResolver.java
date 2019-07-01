package cloud.marciniak.blog.qutoes.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.springframework.beans.factory.annotation.Autowired;

import cloud.marciniak.blog.qutoes.controllers.AuthorController;
import cloud.marciniak.blog.qutoes.controllers.QuoteController;
import cloud.marciniak.blog.qutoes.models.Author;
import cloud.marciniak.blog.qutoes.models.Quote;

public class MutationResolver implements GraphQLMutationResolver {

    @Autowired
    private QuoteController quoteController;
    @Autowired
    private AuthorController authorController;

    public Author createAuthor(Author author) {
        return authorController.createAuthor(author);
    }

    public Quote createQuote(Quote quote) {
        return quoteController.createQuote(quote);
    }
}