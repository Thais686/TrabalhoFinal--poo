public class EquipamentoIluminacao extends Equipamento{
    private String tipo;
    private double watts;
    

    public EquipamentoIluminacao(int codigo, String descricao, double valorDiaria, String resolucao, double luminosidade){
        super(codigo,descricao, valorDiaria);
        this.tipo = tipo;
        this.watts = watts;
    }
@Override
    public double calcularValor(int dias){
        double valor = getValorDiaria() * dias;
        return valor + (valor * 0.10);
    }

}
