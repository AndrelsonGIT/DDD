package org.example.service;

import org.example.model.GitHubUser;

import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class DataBase {
    List<GitHubUser> userList;

    public DataBase(List<GitHubUser> userList) {
        this.userList = userList;
    }

    public Optional<GitHubUser> findUser(String username){
        return userList.stream().filter(user-> user.getName().equals(username)).findFirst();
    }

    public void insertUser(GitHubUser gitHubUser){
        if(userList.contains(gitHubUser)){
            System.out.println("Usuário ja registrado ");
        }
        else{
            userList.add(gitHubUser);
            System.out.println("Usuário adicionado ao banco");
        }
    }

    public void updateUser(String userToBeUpdated, GitHubUser infoToBeupdated){
        Optional<GitHubUser> optionalGitHubUser = this.findUser(userToBeUpdated);
        if(optionalGitHubUser.isEmpty()){
            System.out.println("Usuário não existe na lista");
        }
        else{
            GitHubUser gitHubUser =  optionalGitHubUser.get();
            if(infoToBeupdated.getName()!=null){
                gitHubUser.setName(infoToBeupdated.getName());
            }
            if(infoToBeupdated.getEmail()!=null){
                infoToBeupdated.setEmail(infoToBeupdated.getEmail());
            }
        }
    }

    public void deleteUser(String gitHubUsername){
        Optional<GitHubUser> optionalGitHubUser =  this.findUser(gitHubUsername);
        if(optionalGitHubUser.isEmpty()){
            System.out.println("Usuário não encontrado");
        }else{
            GitHubUser gitHubUserToBeDeleted =  optionalGitHubUser.get();;
            this.userList.remove(gitHubUserToBeDeleted);
        }
    }


    public List<GitHubUser> getUserList() {
        return userList;
    }
}
