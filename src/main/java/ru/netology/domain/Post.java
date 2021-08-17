package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private Likes likes;
    private Comments comments;
    private Reposts reposts;
    private Views views;

    public void getId() {
        this.id = id;
    }

    public void getDate() {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void getLikes() {
        this.likes = likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public void getComments() {
        this.comments = comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public void getReposts() {
        this.reposts = reposts;
    }

    public void setReposts(Reposts reposts) {
        this.reposts = reposts;
    }

    public void getViews() {
        this.views = views;
    }

    public void setViews(Views views) {
        this.views = views;
    }
}
