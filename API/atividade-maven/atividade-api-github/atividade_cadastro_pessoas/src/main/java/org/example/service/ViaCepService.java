package org.example.service;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.example.model.Endereco;

import java.io.IOException;

public class ViaCepService {

    public ViaCepService() {
    }

    public Endereco findAdress(String cep) throws IOException {
        Endereco endereco = null;

        // cria requisição
        HttpGet request = new HttpGet("https://viacep.com.br/ws/" + cep + "/json/");

        //cria o client
        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        // Executa a requisição e retona uma resposta
        CloseableHttpResponse response = httpClient.execute(request);

        //Pega o conteudo interno da resposta(JSON)
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            //transformar o JSON em uma String
            String json = EntityUtils.toString(entity);

            //Instancia o GSON para converter String com json para objetos
            Gson gson = new Gson();

            //mapeia a string para um objeto do tipo Endereco
            endereco = gson.fromJson(json, Endereco.class);
        }
        //retorna o objeto
        return endereco;
    }
}
