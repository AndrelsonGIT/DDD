public class Main {



    public static void main(String[] args) {
        System.out.println("Hello world!");
        TestClass ts = new TestClass();
        String cnpj = "87.979.156/0001-18";
        boolean isCnpjValid =  ts.validateDocument(cnpj);
        System.out.println(isCnpjValid);
    }

}