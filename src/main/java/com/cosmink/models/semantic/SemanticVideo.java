package com.cosmink.models.semantic;

import com.cosmink.models.BaseEntity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class SemanticVideo extends BaseEntity{

    private String name;
    private String link;
    private String words[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }
}
