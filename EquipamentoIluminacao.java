public class EquipamentoIluminacao extends Equipamento{
    private String tipo;
    private double watts;
    

    public EquipamentoIluminacao(int codigo, String descricao, double valorDiaria, String resolucao, double luminosidade){
        super(codigo,descricao, valorDiaria);
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
        this.tipo = tipo;
        this.watts = watts;
    }
@override
    public double CalcularValor(int dias){
        float valor = getvalorDiaria() * dias;
        return valor + (valor * 0.10);
    }

}
