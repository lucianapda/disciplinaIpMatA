/*
 e imprimira
sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).

Gordura __
Faça um programa para 

Entrada __
ler três notas de um aluno em uma disciplina

Processo __
média ponderada = noata1 * 0.5 + nota2 * 0.3 + nota3 * 0.2

Saída ___
média ponderada

Teste ___
nota1 = 8,5
nota2 = 4,6
nota3 = 9,2
medPonderada = (8,5 * 0.5) + (4,6 * 0.3) + (9,2 * 0.2);
medPonderada = (8,5 * 0.5) + (4,6 * 0.3) + (9,2 * 0.2);
medPonderada = 4,25 + 1,38 + 1,84;
medPonderada = 7,47;

*/

import java.util.Scanner;

public class Uni3Exe04 {
  public static void main(String[] args) {

    // Varíaves ___
    Scanner teclado = new Scanner(System.in);
    double nota1, nota2, nota3, medPonderada;

    // Entrada ___
    System.out.print("Nota1: ");
    nota1 = teclado.nextDouble();
    System.out.print("Nota2: ");
    nota2 = teclado.nextDouble();
    System.out.print("Nota3: ");
    nota3 = teclado.nextDouble();

    // Processo ___
    medPonderada = (nota1 * 0.5) + (nota2 * 0.3) + (nota3 * 0.2);

    // Saída __
    System.out.print("Média ponderada: " + medPonderada);


    teclado.close();
  }
}
