package cloud.marciniak.blog.qutoes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cloud.marciniak.blog.qutoes.controllers.AuthorController;
import cloud.marciniak.blog.qutoes.controllers.QuoteController;
import cloud.marciniak.blog.qutoes.resolvers.MutationResolver;
import cloud.marciniak.blog.qutoes.resolvers.QueryResolver;

@Configuration
public class GraphqlConfiguration {

    @Bean
    public QueryResolver query() {
        return new QueryResolver();
    }

    @Bean
    public MutationResolver mutation() {
        return new MutationResolver();
    }

    @Bean
    public QuoteController quoteController() {
        return new QuoteController();
    }

    @Bean
    public AuthorController authorController() {
        return new AuthorController();
    }
}
