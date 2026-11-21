public class EquipamentoProjecao extends Equipamento{
    private String resolucao;
    private double luminosidade;
    

    public EquipamentoProjecao(int codigo, String descricao, double valorDiaria, String resolucao, double luminosidade){
        super(codigo,descricao, valorDiaria);
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        this.resolucao = resolucao;
        this.luminosidade = luminosidade;
    }

    @override
    public double CalcularValor(int dias){
        double valor = (getvalorDiaria() * dias);
        if (dias >= 5){
        valor = valor - (valor * 0.10);
    }
        return valor;
    }
}
