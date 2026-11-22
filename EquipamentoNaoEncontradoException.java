public class EquipamentoNaoEncontradoException extends Exception {
    public EquipamentoNaoEncontradoException(int codigo) {
        super("Equipamento " + codigo + " não encontrado!");
    }
    
}
