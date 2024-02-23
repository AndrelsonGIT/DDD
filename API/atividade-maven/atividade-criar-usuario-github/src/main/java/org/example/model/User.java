package org.example.model;

public class User {

    private String id;

    private String githubName;

    private String email;

    private int repositories;

    private int followers;

    public User() {
    }

    public User(String id, String githubName, String email, int repositories, int followers) {
        this.id = id;
        this.githubName = githubName;
        this.email = email;
        this.repositories = repositories;
        this.followers = followers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGithubName() {
        return githubName;
    }

    public void setGithubName(String githubName) {
        this.githubName = githubName;
    }

    public int getRepositories() {
        return repositories;
    }

    public void setRepositories(int repositories) {
        this.repositories = repositories;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}
