package org.example.model;

import com.google.gson.Gson;
import org.example.FectherApi;
import org.example.MoneyConverter;

public class BitCoinConverter extends MoneyConverter {

    public BitCoinConverter(FectherApi fectherApi, Gson gson) {
        super(fectherApi, gson);
    }

    @Override
    public double getQuota() {
        String response = this.getFectherApi().fetchRequest ("https://economia.awesomeapi.com.br/json/last/BTC-BRL");
        Bitcoin bitcoin =  this.getGson().fromJson(response, Bitcoin.class);
        return bitcoin.getBTCBR().getAsk();
    }


}
