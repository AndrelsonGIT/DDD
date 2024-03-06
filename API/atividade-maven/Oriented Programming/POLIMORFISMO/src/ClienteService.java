import java.util.HashMap;

public class ClienteService {


    private HashMap<Integer, Cliente> listaProdutos;

    private static int qtdProdutos = 1;

    public ClienteService() {
        listaProdutos = new HashMap<>();
    }

    public void adicionar(Cliente cliente){
        listaProdutos.put(qtdProdutos, cliente);
        qtdProdutos++;
    }

    public void exibirClientes(){
        listaProdutos.forEach((key, value)->{
            System.out.println("------");
            System.out.println("Cliente id: " + qtdProdutos);
            System.out.println("cliente nome: " + value.getNome());
            System.out.println("Cliente idade: " + value.getIdade());
            System.out.println("Cliente nome conta"+value.getConta().getNome());
            System.out.println("Cliente Agencia: " + value.getConta().getAgencia());
            System.out.println("Cliente numero conta: "+value.getConta().getNumero());
            System.out.println("Cliente ");
            System.out.println("-------");
            );
            System.out.println("------");
        });
    }

    public void editarCliente(int id, Cliente cliente) {
        Cliente clienteProduto = procurarCliente(id);
        if (clienteProduto == null){
            System.out.println("Produto não encontrado na lista");
        }
        if( !(clienteProduto.getNome().equals("")) || clienteProduto.getNome() != null){
          clienteProduto.setNome(clienteProduto.getNome());
        }
        if(clienteProduto.getIdade() >= 0){
            clienteProduto.setIdade(cliente.getIdade());
        }
        System.out.println("Cliente atualizado!");
    }

    public void editarCliente(int idCliente, Conta conta){
        Cliente clienteProduto = procurarCliente(idCliente);
        if (clienteProduto == null){
            System.out.println("Produto não encontrado na lista");
        }
        if(conta.getNumero().equalsIgnoreCase("") && conta.getNumero() != null)){
            clienteProduto.getConta().setNumero(conta.getNumero());
        }
        if(conta.getAgencia().equalsIgnoreCase("") && conta.getAgencia() != null)){
            clienteProduto.getConta().setAgencia(conta.getAgencia());
        }
        if(conta.getNome().equalsIgnoreCase("") && conta.getNome() != null)){
            clienteProduto.getConta().setNome(conta.getNome());
        }
    }

    public void removerProduto(int id){
        if(listaProdutos.containsKey(id)){
            System.out.println("Produto não existe na lista");
        }else{
            listaProdutos.remove(id);
            System.out.println("Produto removido com sucesso!");
        }

    }


    public Cliente procurarCliente(int id){
        return listaProdutos.get(id);
    }



}
