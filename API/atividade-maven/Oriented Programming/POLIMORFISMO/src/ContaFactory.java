public class ContaFactory {

    public static Conta create(String type){
        if(type.equalsIgnoreCase("p")){
            return new ContaPoupanca();
        }
        else{
            return new ContaCorrente();
        }
    }
}
