//1- Desenvolva um programa em Java que solicite ao usuário os valores dos lados de 
// um retângulo e calcule e mostre seu perímetro e sua área.

import java.util.Scanner;
public class Exercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarando as variaveis
        double area , base , altura , perimetro ;  
       
        //Entrada de dados 
        System.out.println("Digite a base do retangulo ?");
        base = sc.nextDouble();
        System.out.println("Digite a altura do retangulo ? ");
        altura = sc.nextDouble();
        //Operação
        area = base * altura;
        perimetro = (base + altura) * 2;
        //Saida de dados 
        System.out.println("O retangulo tem o perimetro de: " +perimetro+" \nO retangulo tem a area de : "+area);
    }
}