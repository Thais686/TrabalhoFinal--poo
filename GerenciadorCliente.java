import java.util.ArrayList;

public class GerenciadorCliente {
    public ArrayList<Cliente> clientesCadastrados;

    public GerenciadorCliente(){
        clientesCadastrados = new ArrayList<Cliente>();
    }

    public void cadastrar(Cliente c) throws IllegalArgumentException {
        if (c.getNome().length() < 3) {
            throw new IllegalArgumentException("Nome do cliente deve ter pelo menos 3 caracteres.");
        }
        clientesCadastrados.add(c);
    }

    public void consultar(String nome) throws ClienteNaoEncontradoException{
        for(Cliente c: clientesCadastrados){
            if (c.getNome().equals(nome)){
                System.out.printf("Cliente %s cadastrado!!\n", nome);
            }
        }
        throw new ClienteNaoEncontradoException(nome);
    }

    public void listar(){
        for(Cliente c: clientesCadastrados){ 
            System.out.println("ID"+ c.getId() + "nome:" + c.getNome() + "telefone:" + c.getTelefone() + "email:" + c.getEmail());
    
        }
}}
