package org.example.model;

public class GitHubUser {

    private String name;

    private String email;

    private int public_repos;

    private int followers;

    public GitHubUser() {
    }

    public GitHubUser(String name, String email, int public_repos, int followers) {
        this.name = name;
        this.email = email;
        this.public_repos = public_repos;
        this.followers = followers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
