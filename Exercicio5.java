//5- Escreva um programa em Java que obtenha uma temperatura em graus Celsius,
//calcule e mostre a respectiva temperatura nas escalas Fahrenheit e Kelvin.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaração de variaveis 
        double grauCelsius , grauFahrenheit , grauKelvin ;

        //Entrada de dados 
        System.out.println("Digite a temperatura em grau celsius");
        grauCelsius = sc.nextDouble();

        //Operação
        grauFahrenheit = 1.8 * grauCelsius + 32 ;
        grauKelvin = grauCelsius + 273 ;
        //Saida de dados
        System.out.printf("Os graus em fahrenheit é : %.1f " , grauFahrenheit);
        System.out.printf("\nOs graus em kelvin é : %.1f " , grauKelvin);
    }
}
