import java.util.ArrayList;

public class GerenciadorEquipamentos {

    public ArrayList<Equipamento> equipamentos;

    public GerenciadorEquipamentos() {

        equipamentos = new ArrayList<Equipamento>();

    }

    public void cadastrar(Equipamento e1) {

        equipamentos.add(e1);

    }

    public void listar() {

        for (Equipamento e1 : equipamentos) {

            System.out.println(
                    "ID" + e1.getCodigo() + "descricao:" + e1.getDescricao() + "valor diária:" + e1.getValorDiaria());

        }
    }

    public void consultar(int codigo) throws EquipamentoNaoEncontradoException {
        for (Equipamento e1 : equipamentos) {
            if (e1.getCodigo() == codigo) {
                System.out.printf("Equipamento %d cadastrado!!\n", codigo);
                return;
            }
        }
        throw new EquipamentoNaoEncontradoException(codigo);
    }

    public void estaDisponivel() {

        for (Equipamento e1 : equipamentos) {

            if (e1.isDisponivel() == true) {

                System.out.println("ID" + e1.getCodigo() + "descricao:" + e1.getDescricao() + "valor diária:"
                        + e1.getValorDiaria());
            }

        }
    }
}
