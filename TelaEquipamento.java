import javax.swing.*;
import java.awt.*;


public class TelaEquipamento {
    JFrame janela = new JFrame ("Tela de Equipamentos");
    JLabel label = new JLabel ("Código do Equipamento:");
    JTextField campoCodigo = new JTextField(10);
    JLabel label2 = new JLabel ("Descrição do Equipamento:");
    JTextField campoDescricao = new JTextField(30);
    JLabel label3 = new JLabel ("Valor da Diária:");
    JTextField campoValorDiaria = new JTextField(5);
    JLabel label4 = new JLabel ("Tipo de Equipamento:");
    JComboBox<String> eTipo = new JComboBox<String>(new String[] {"Som", "Iluminação", "Projeção"});
    JLabel lbeS1 = new JLabel("Potência do som:");
    JTextField campoPotencia = new JTextField(5);
    JLabel lbeS2 = new JLabel("Quantidade de canais:");
    JTextField campoCanais = new JTextField(5);

    JLabel lbeI1 = new JLabel("tipo da iluminação:");
    JTextField campoTipoI = new JTextField(20);
    JLabel lbeI2 = new JLabel("Potência da iluminação:");
    JTextField campoPotenciaI = new JTextField(5);

    JLabel lbeP1 = new JLabel("Resolução:");
    JTextField campoResolucao = new JTextField(20);
    JLabel lbeP2 = new JLabel("Luminosidade:");
    JTextField campoLuminosidade = new JTextField(5);

    JPanel painelSom = new JPanel();
    JPanel painelIluminacao = new JPanel();
    JPanel painelProjecao = new JPanel();

    JButton cadastrar = new JButton("Cadastrar");


    public TelaEquipamento(){
        janela.setSize(500,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = janela.getContentPane();
        contentPane.setLayout(new GridLayout(5,2)); 
        contentPane.add(label); 
        contentPane.add(campoCodigo);
        contentPane.add(label2);
        contentPane.add(campoDescricao);
        contentPane.add(label3);
        contentPane.add(campoValorDiaria);
        contentPane.add(label4);
        contentPane.add(eTipo);
        contentPane.add(cadastrar);
        janela.setVisible(true);

    }

}
