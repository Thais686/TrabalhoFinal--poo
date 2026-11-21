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


    
}
