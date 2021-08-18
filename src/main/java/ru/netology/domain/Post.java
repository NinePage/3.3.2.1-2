package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private Likes likes;
    private Comments comments;
    private Reposts reposts;
    private Views views;
    private int idOwner;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private Copyright copyright;
    private String postType;
    private PostSource postSource;
    private Geo geo;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAsd;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;

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

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAsd() {
        return markedAsAsd;
    }

    public void setMarkedAsAsd(int markedAsAsd) {
        this.markedAsAsd = markedAsAsd;
    }

    public boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
