import java.util.ArrayList; 

public class Locacao {
    private Cliente cliente;
    private int qntdDias;
    private boolean finalizado;
    private ArrayList<Equipamento> equipamentos;


    public Locacao(Cliente cliente, int qntdDias){
        this.cliente = cliente;
        this.qntdDias =qntdDias;
        equipamentos = new ArrayList<Equipamento>();
        this.finalizado= false;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public int getQntdDias() {
        return qntdDias;
    }
    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }


    public boolean getFinalizado() {
    return finalizado;
}

   public void adicionarEquipamento(Equipamento equipamento) throws EquipamentoJaAlugadoException, EquipamentoJaEstaNaSuaLocacaoException {

    if (!equipamento.isDisponivel()) {
        throw new EquipamentoJaAlugadoException(equipamento.getCodigo());
    }

    for (Equipamento e : equipamentos) {

        if (e.getCodigo() == equipamento.getCodigo()) {
            throw new EquipamentoJaEstaNaSuaLocacaoException(equipamento.getCodigo());
        }
    }

    equipamentos.add(equipamento);
    equipamento.setDisponivel(false);
   }

public double calcularValorEquipamento(Equipamento e) {
    return e.calcularValor(qntdDias);
}


public double calcularTotal() {
    double total = 0;

    for (Equipamento equipamento : equipamentos) {
        total = total + equipamento.calcularValor(qntdDias);
    }

    return total;
}
    

public double registrarDevolucao(int diasUtilizados) {

    int atraso = diasUtilizados - qntdDias;

    double multa = 0;

    if (atraso > 0) {
        multa = atraso * 5.0;
    }

    for (Equipamento equipamento : equipamentos) {
        equipamento.setDisponivel(true);
    }
    finalizado=true;

    return multa;
}


}

