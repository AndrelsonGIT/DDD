package org.example;

public class Cliente {

    private int id;
    private String nome;
    private int idade;
    private String email;
    private ContaBancaria contaBancaria;

    public Cliente() {
    }

    public Cliente(int id, String nome, int idade, String email){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.contaBancaria = null;
    }

    public Cliente(int id, String nome, int idade, String email, ContaBancaria contaBancaria) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    public String exibirNomeIdade(){
        return "nome: "+this.nome+" idade: "+this.idade;
    }

    public String exibirDadosConta(){
        return "Dados conta cliente:\n" +
                "Agencia: "+this.contaBancaria.getAgencia()+
                "\nNumero conta: "+this.contaBancaria.getNumero()+
                "\nSaldo conta: "+this.contaBancaria.getSaldo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}
