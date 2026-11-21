public class EquipamentoIluminacao extends Equipamento{
    private String tipo;
    private double potencia;
    

    public EquipamentoIluminacao(int codigo, String descricao, double valorDiaria, String tipo, double potencia){
        super(codigo,descricao, valorDiaria);
        this.tipo = tipo;
        this.potencia = potencia;
    }
@Override
    public double calcularValor(int dias){
        double valor = getValorDiaria() * dias;
        return valor + (valor * 0.10);
    }

}
