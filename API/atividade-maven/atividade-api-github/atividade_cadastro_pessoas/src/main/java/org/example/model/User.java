package org.example.model;

public class User {

    private String name;

    private String email;

    private String streetAddress;

    private String city;

    private String state;

    private String houseNumber;

    private String complement;

    public User() {
    }

    public User(String name, String email, Endereco endereco, String houseNumber, String complement ){
        this.name = name;
        this.email = email;
        this.streetAddress = endereco.getLogradouro();
        this.state = endereco.getUf();
        this.city = endereco.getLocalidade();
        this.houseNumber = houseNumber;
        this.complement = complement;
    }

    public User(String name, String email, String streetAddress, String city, String state, String houseNumber, String complement) {
        this.name = name;
        this.email = email;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.houseNumber = houseNumber;
        this.complement = complement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
