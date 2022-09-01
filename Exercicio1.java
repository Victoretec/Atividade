//escreva um programa em Java que solicite ao usuário a distância entre duas
//cidades e o tempo de viagem. O programa deverá calcular e exibir a velocidade média
//de um carro que vai de uma cidade para outra. 

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaração de variaveis 
        double distancia , tempo ,velocidadeMedia;

        //Entrada de dados 
        System.out.println("DIgite a seu KM percorrido ?");
        distancia = sc.nextDouble();
        System.out.println("Digite o seu tempo de viagem ?");
        tempo = sc.nextDouble();

        //Operação 
        velocidadeMedia = distancia / tempo;

        //Saida de dados 
        System.out.println("A sua velocidade média foi: "+velocidadeMedia);
        
    }
}
