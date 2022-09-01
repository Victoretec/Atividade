//4- Escreva um programa em Java que calcule as duas raízes de uma equação de 2º
//grau ax²+bx+c, conhecendo os valores dos coeficientes da mesma (a, b, c). Suponha
//que as raízes são reais.

import java.util.Scanner;
public class Exercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaração de variaveis 
        double a , b , c , delta ,x1 , x2 ;
        
        //Entrada de dados
        System.out.println("Digite o numero do coeficiente A ? ");
        a = sc.nextDouble();
        System.out.println("Digite o numero do coeficiente B ?");
        b = sc.nextDouble();
        System.out.println("Digite o numero do coeficiente C ?");
        c = sc.nextDouble();
        //Operação
        delta =  Math.pow(b,2) - (4 *(a*c)) ;
        x1 = (- b + Math.sqrt(delta)) / (2*a) ; 
        x2 = (- b - Math.sqrt(delta) ) / (2*a);
        //Saida de dados
        System.out.println(" As raizes da equação de segundo grau: \n positiva é: "+x1+ " \n negativa é:: "+x2);
    }
}