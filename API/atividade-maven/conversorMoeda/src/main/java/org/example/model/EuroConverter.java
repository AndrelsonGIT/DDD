package org.example.model;

import com.google.gson.Gson;
import org.example.FectherApi;
import org.example.MoneyConverter;

public class EuroConverter extends MoneyConverter {

    public EuroConverter(FectherApi fectherApi, Gson gson) {
        super(fectherApi, gson);
    }

    @Override
    public double getQuota() {
        String response =  this.getFectherApi().fetchRequest("https://economia.awesomeapi.com.br/json/last/EUR-BRL");
        Euro euro = this.getGson().fromJson(response, Euro.class);
        return euro.getEURBRL().getAsk();
    }
}
