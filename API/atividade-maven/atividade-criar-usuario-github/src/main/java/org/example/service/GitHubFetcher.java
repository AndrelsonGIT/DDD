package org.example.service;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.example.model.GitHubUser;

import java.io.IOException;

public class GitHubFetcher {

    public GitHubUser findGitHubUser(String username){
        HttpGet httpGet = new HttpGet("https://api.github.com/users/"+username);
        GitHubUser githubUser = null;
        try{
            CloseableHttpClient client = HttpClientBuilder.create().disableRedirectHandling().build();
            CloseableHttpResponse response = client.execute(httpGet);
            HttpEntity httpEntity =  response.getEntity();
            if(httpEntity !=null){
                String result = EntityUtils.toString(httpEntity);
                Gson gson = new Gson();
                githubUser =  gson.fromJson(result, GitHubUser.class);
            }
        } catch (
                ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        return githubUser;
    }

}
