//Soma de Matrizes:
//Desenvolva um programa que realiza a soma de duas matrizes 3X3, exibindo o resultado no console. 

import java.util.Scanner;

public class atv01 {

    public static void main(String[] args) {
       double[][] numeros = new double[3][3];
       double soma = 0;
       Scanner ler = new Scanner(System.in);

       for (int l = 0; l <= 2; l++) {
           for (int c = 0; c <= 2; c++) {
               System.out.println("Digite um valor: ");
               numeros[l][c] = ler.nextDouble();
           }
       }

       for (double[] numero : numeros){
           for (double num : numero) {
               soma += num;
           }  
       }

       System.out.println("Soma: " + soma);
    }
}