package cloud.marciniak.blog.qutoes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cloud.marciniak.blog.qutoes.exceptions.AuthorNotFoundException;
import cloud.marciniak.blog.qutoes.models.Author;
import cloud.marciniak.blog.qutoes.repositories.AuthorRepository;

public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    public Author findAuthorById(String id) {
        return authorRepository.findById(id)
            .orElseThrow(() -> new AuthorNotFoundException("Author not found!", id));
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public void deleteAuthor(Author author) {
        authorRepository.delete(author);
    }
}