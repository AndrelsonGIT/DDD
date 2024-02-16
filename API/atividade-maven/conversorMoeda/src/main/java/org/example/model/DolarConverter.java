package org.example.model;

import com.google.gson.Gson;
import org.example.FectherApi;
import org.example.MoneyConverter;
public class DolarConverter extends MoneyConverter {


    public DolarConverter(FectherApi fectherApi, Gson gson) {
        super(fectherApi, gson);
    }

    @Override
    public double getQuota() {
        String result = super.getFectherApi().fetchRequest("https://economia.awesomeapi.com.br/json/last/USD-BRL");
        Dolar dolar = super.getGson().fromJson(result, Dolar.class);
        return dolar.getUsdbrl().getAsk();
    }
}
