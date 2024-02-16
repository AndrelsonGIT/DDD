package org.example;

import com.google.gson.Gson;
import org.example.model.BitCoinConverter;
import org.example.model.DolarConverter;
import org.example.model.EuroConverter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Gson gson = new Gson();
        FectherApi fectherApi = new FectherApi();
        DecimalFormat df = new DecimalFormat("0.00");
        CoinConverser coinConverser = null;

        System.out.println("Conversor de moedas!!");
        System.out.println("Digite o valor em R$: ");

        double userValueInReal = ler.nextDouble();

        while(true){
            System.out.println("Deseja converter para:");
            System.out.println("1. Dolar");
            System.out.println("2. Euro");
            System.out.println("3. Bitcoin");

            int userOption = ler.nextInt();

            String userCoinOption = null;
            if(userOption== 1){
                userCoinOption = "Dólar";
                DolarConverter dolarConverter = new DolarConverter(fectherApi, gson);
                coinConverser = new CoinConverser(dolarConverter);
            }
            else if(userOption == 2){
                userCoinOption = "Euro";
                EuroConverter euroConverter = new EuroConverter(fectherApi, gson);
                coinConverser = new CoinConverser(euroConverter);
            }
            else if(userOption == 3){
                userCoinOption = "Bitcoin";
                BitCoinConverter bitCoinConverter = new BitCoinConverter(fectherApi, gson);
                coinConverser = new CoinConverser(bitCoinConverter);
            }

            double result = coinConverser.convert(userValueInReal);
            System.out.println("A conversão do valor: R$"+userValueInReal+" equivalente em "+userCoinOption+" é: R$"+df.format(result));
        }
    }
}