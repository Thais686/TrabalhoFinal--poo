import java.util.ArrayList; 

public class Locacao {
    private Cliente cliente;
    private int qntdDias;
    private ArrayList<Equipamento> equipamentos;


    public Locacao(Cliente cliente, int qntdDias){
        this.cliente = cliente;
        this.qntdDias =qntdDias;
        equipamentos = new ArrayList<Equipamento>();
    }

    public ArrayList<Equipamento> getEquipamentos() {
        return equipamentos;
    }

   public void adicionarEquipamento(Equipamento equipamento) {

    if (!equipamento.isDisponivel()) {
        System.out.println("Equipamento já está alugado.");
        return;
    }

    for (Equipamento e : equipamentos) {

        if (e.getCodigo() == equipamento.getCodigo()) {
            System.out.println("Equipamento já está na locação.");
            return;
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

}

    
    


