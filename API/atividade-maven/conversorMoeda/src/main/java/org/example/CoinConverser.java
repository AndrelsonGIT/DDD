package org.example;

public class CoinConverser {

    private MoneyConverter moneyConverter;

    public CoinConverser(MoneyConverter moneyConverter) {
        this.moneyConverter = moneyConverter;
    }

    public double convert(double money){
        return (money / moneyConverter.getQuota());
    }
}
