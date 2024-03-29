package cloud.marciniak.blog.qutoes.exceptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class AuthorNotFoundException extends RuntimeException implements GraphQLError {

    private static final long serialVersionUID = 1L;

    private Map<String, Object> extensions = new HashMap<>();

    public AuthorNotFoundException(String message, String invalidAuthorId) {
        super(message);
        extensions.put("invalidAuthorId", invalidAuthorId);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return extensions;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.DataFetchingException;
    }
}