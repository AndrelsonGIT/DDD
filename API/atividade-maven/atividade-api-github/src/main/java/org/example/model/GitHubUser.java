package org.example.model;

public class GitHubUser {

    private String name;

    private int public_repos;

    private int followers;

    public GitHubUser() {
    }

    public GitHubUser(String name, int public_repos, int followers) {
        this.name = name;
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
}
