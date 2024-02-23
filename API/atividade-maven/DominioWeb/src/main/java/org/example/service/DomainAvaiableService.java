package org.example.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.example.model.StatusDominio;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Date;

public class DomainAvaiableService {

    public StatusDominio isDomainAvaiable(String webDomain) throws IOException {
        StatusDominio statusDominio = null ;

        HttpGet request = new HttpGet("https://brasilapi.com.br/api/registrobr/v1/"+webDomain);

        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        CloseableHttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        if (entity != null) {

            String json = EntityUtils.toString(entity);

            JSONObject payload = new JSONObject(json);

            String status = payload.get("status").toString();
            String expiresAt = payload.get("expires-at").toString();

            statusDominio = new StatusDominio(status, expiresAt);
        }
        return statusDominio;
    }
}
