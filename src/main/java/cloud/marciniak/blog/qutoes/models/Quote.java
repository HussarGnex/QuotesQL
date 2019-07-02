package cloud.marciniak.blog.qutoes.models;

import org.springframework.data.annotation.Id;

public class Quote {
    
    @Id
    private String id;
    private String qoute;
    private String authorId;
    private String source;

    public Quote() {
    }

    public Quote(String id, String qoute, String authorId, String source) {
        this.id = id;
        this.qoute = qoute;
        this.authorId = authorId;
        this.source = source;
    }

    public String getQoute() {
        return qoute;
    }

    public void setQoute(String qoute) {
        this.qoute = qoute;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Quote [authorId=" + authorId + ", id=" + id + ", qoute=" + qoute + ", source=" + source + "]";
    }
}