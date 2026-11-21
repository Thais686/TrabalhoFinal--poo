
public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private int id;

    

    public Cliente(String nome, String telefone, String email, int id){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public int getId(){
        return id;
    }
    
    public String getEmail(){
        return email;
    }
}
