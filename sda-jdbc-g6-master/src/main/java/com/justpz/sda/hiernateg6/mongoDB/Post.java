package com.justpz.sda.hiernateg6.mongoDB;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Objects;

@Document
public class Post {
    @Id
    private String id;
 //   private ObjectId id;

    private String name;
    private String messaneg;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) &&
                Objects.equals(name, post.name) &&
                Objects.equals(messaneg, post.messaneg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, messaneg);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessaneg() {
        return messaneg;
    }

    public void setMessaneg(String messaneg) {
        this.messaneg = messaneg;
    }
}
