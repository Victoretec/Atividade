//2- Escreva um programa em Java que solicite ao usuário o salário atual e mostre o
//salário acrescido de 5% de comissão.
import java.util.Scanner;
public class Exercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaração de variaveis
        double salarioAtual, comissao , salarioAcrescido ;
        comissao = 0.05; //Percentual da Comissão de 5% 
        //Entrada de dados
        System.out.println("Digite o salário atual");
        salarioAtual = sc.nextDouble();
        
        //Operação
        salarioAcrescido = salarioAtual + (comissao * salarioAtual);

        //Saida de dados
        System.out.println("O salário com a comissão é : " +salarioAcrescido);

    }
}
