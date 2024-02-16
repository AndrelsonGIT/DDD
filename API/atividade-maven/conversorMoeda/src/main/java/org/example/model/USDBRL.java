package org.example.model;

public class USDBRL {

   private String ask;

   public USDBRL(){}

    public USDBRL(String  ask) {
        this.ask = ask;
    }

    public double getAsk() {
        return Double.parseDouble(this.ask);
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }
}
