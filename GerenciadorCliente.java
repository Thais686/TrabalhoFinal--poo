import java.util.ArrayList;

public class GerenciadorCliente {
    public ArrayList<Cliente> clientesCadastrados;

    public GerenciadorCliente(){
        clientesCadastrados = new ArrayList<Cliente>();
    }

    public void cadastrar(Cliente c){
        clientesCadastrados.add(c);
    }

    public void consultar(String nome){
        for(Cliente c: clientesCadastrados){
            if (c.getNome().equals(nome)){
                System.out.printf("Cliente %s cadastrado!!\n", nome);
            }
        }
        System.out.printf("Cliente não cadastrado!\n");
    }

    public void listar(){
        for(Cliente c: clientesCadastrados){ 
            System.out.println("ID"+ c.getId() + "nome:" + c.getNome() + "telefone:" + c.getTelefone() + "email:" + c.getEmail());
    
        }
}}

