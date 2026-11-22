import java.util.ArrayList;

public class GerenciadorLocacao {

public ArrayList<Locacao> locacoes;


public GerenciadorLocacao(){

    locacoes= new ArrayList<Locacao>();

}

public void cadastrar(Locacao l1) {

    locacoes.add(l1);
 }

public void mostrarHistorico() {

        for (Locacao l : locacoes) {

            System.out.println("Cliente: " + l.getCliente());
            System.out.println("Quantidade de dias: " + l.getQntdDias());

            System.out.println("Equipamentos:");

            for (Equipamento e : l.getEquipamentos()) {
                System.out.println(e.getCodigo());
            }

        }
    }

    public void listarLocacoesAtivas() {

    for (Locacao l : locacoes) {

        if (!l.getFinalizado()) {
            System.out.println("Cliente: " + l.getCliente().getNome());
            System.out.println("Dias: " + l.getQntdDias());
        }
    }
         }

    public void consultarHistorico(Cliente cliente) {

    for (Locacao l : locacoes) {

        if (l.getCliente().equals(cliente)) {

            System.out.println("Quantidade de dias: " + l.getQntdDias());

            for (Equipamento e : l.getEquipamentos()) {
                System.out.println("Equipamento: " + e.getCodigo());
            
        }
    }
}
    }

public void exibirDetalhes(Locacao l) {

    System.out.println("Cliente: " + l.getCliente().getNome());
    System.out.println("Quantidade de dias: " + l.getQntdDias());

    System.out.println("Equipamentos:");

    for (Equipamento e : l.getEquipamentos()) {

        System.out.println("Equipamento: " + e.getCodigo());

        System.out.println("Valor: R$ " + l.calcularValorEquipamento(e));
    }

    System.out.println("Valor total: R$ " + l.calcularTotal());
}
    
    
}
