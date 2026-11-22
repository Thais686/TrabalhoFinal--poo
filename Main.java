import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bem-vindo ao sistema de locação de equipamentos!");
    System.out.println("Escolha uma opção de equipamento: 1-Som, 2-Ilumianção, 3-Projeção");
    int op= scanner.nextInt();

    System.out.print("ID: ");
    int ID = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Descricao: ");
    String descricao = scanner.nextLine();
    System.out.print("Valor da diária: ");
    double valorDiaria = scanner.nextDouble();
    scanner.nextLine();
    


    
}