package org.example.model;

public class EURBL {

    private String ask;


    public EURBL(String ask) {
        this.ask = ask;
    }

    public double getAsk() {
        return Double.parseDouble(this.ask);
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }



}
