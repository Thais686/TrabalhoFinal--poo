public abstract class Equipamento {

    private int codigo;
    private String descricao;
    private double valorDiaria;
    private boolean disponivel;

    public Equipamento(int codigo, String descricao, double valorDiaria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public abstract double calcularValor(int dias);
}