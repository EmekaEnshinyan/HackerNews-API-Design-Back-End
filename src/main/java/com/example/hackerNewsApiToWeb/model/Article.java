package com.example.hackerNewsApiToWeb.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class Article {
    private UUID unique;
    private String by;
    private int descendants;
    private int id;
    private String[] kids;
    private int score;
    private int time;
    private String title;
    private String type;
    private String url;

    //12. when data is inputted in postman as json text, want to send that data to server
    //13. first need to define property into java class like putting @JSONPorperty below
    @Autowired
    public Article(@JsonProperty("unique") UUID unique, @JsonProperty("by") String by,
                   @JsonProperty("descendants") int descendants, @JsonProperty("id") int id,
                   @JsonProperty("kids") String[] kids, @JsonProperty("score") int score,
                   @JsonProperty("time") int time, @JsonProperty("title") String title,
                   @JsonProperty("type") String type, @JsonProperty("url") String url) {
        super();
        this.unique = unique;
        this.by = by;
        this.descendants = descendants;
        this.id = id;
        this.kids = kids;
        this.score = score;
        this.time = time;
        this.title = title;
        this.type = type;
        this.url = url;
    }
    @Autowired
    public Article(){}

    public UUID getUnique(){return unique;}

    public void setUnique(UUID unique){this.unique = unique;}

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public int getDescendants() {
        return descendants;
    }

    public void setDescendants(int descendants) {
        this.descendants = descendants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CharSequence[] getKids() {
        return kids;
    }

    public void setKids(String[] kids) {
        this.kids = kids;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}