package org.example;

import org.example.model.StatusDominio;
import org.example.service.DomainAvaiableService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Verificador de dominio web");
        DomainAvaiableService domainAvaiableService = new DomainAvaiableService();
        while(true){
            System.out.println("Digite um dominio, exemplo(google.com): ");
            String domainWebUser = ler.next();
            StatusDominio statusDominio = null;
            try{
                statusDominio = domainAvaiableService.isDomainAvaiable(domainWebUser);
            }catch(IOException e){
                System.out.println("Ocorreu um erro ao tentar achar o dominio");
            }
            if(statusDominio.getStatus().equals("AVAILABLE")){
                System.out.println("O dominio "+domainWebUser+" está disponível");
            }
            else{
                System.out.println("O dominio "+domainWebUser+" não está disponível");
                System.out.println("Data de expiração: "+statusDominio.getExpiresAt());
            }
        }
    }
}