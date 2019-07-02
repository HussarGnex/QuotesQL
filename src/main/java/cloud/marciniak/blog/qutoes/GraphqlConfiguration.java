package cloud.marciniak.blog.qutoes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cloud.marciniak.blog.qutoes.controllers.AuthorController;
import cloud.marciniak.blog.qutoes.resolvers.AuthorResolver;
import cloud.marciniak.blog.qutoes.resolvers.MutationResolver;
import cloud.marciniak.blog.qutoes.resolvers.QueryResolver;
import cloud.marciniak.blog.qutoes.resolvers.QuoteResolver;

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
    public QuoteResolver quoteResolver() {
        return new QuoteResolver();
    }

    @Bean
    public AuthorResolver authorResolver() {
        return new AuthorResolver();
    }
}
