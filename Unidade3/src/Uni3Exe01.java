/*
terrenos retangulares.  e depois .

Gordura ____
Uma imobiliária vende apenas 
Faça um programa para 

Entrada __
ler as dimensões de um terreno

Processo __

Saída __
exibir a área do terreno

*/

import java.util.Scanner;

public class Uni3Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Variáveis
    double largura = 0;
    double altura = 0;
    double area = 0;

    // Entrada
    System.out.println("Entre c/ largura: ");
    largura = teclado.nextDouble();
    System.out.println("Entre c/ altura: ");
    altura = teclado.nextDouble();
    
    // Processo
    area = largura * altura;
    
    // Saída
    System.out.println("Área: " + area);

    teclado.close();
  }
}

