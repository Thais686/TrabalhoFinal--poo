public class ClienteNaoEncontradoException extends Exception {
    public ClienteNaoEncontradoException(String nome) {
        super("Cliente " + nome + " não encontrado!");
    }
    
}
