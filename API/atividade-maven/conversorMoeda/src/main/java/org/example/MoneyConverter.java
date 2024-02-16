package org.example;

import com.google.gson.Gson;

public abstract class MoneyConverter {

    private FectherApi fectherApi;
    private Gson gson;


    public MoneyConverter() {
    }

    public MoneyConverter(FectherApi fectherApi, Gson gson) {
        this.fectherApi = fectherApi;
        this.gson = gson;
    }

    public abstract double getQuota();

    public FectherApi getFectherApi() {
        return fectherApi;
    }

    public void setFectherApi(FectherApi fectherApi) {
        this.fectherApi = fectherApi;
    }

    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }
}
