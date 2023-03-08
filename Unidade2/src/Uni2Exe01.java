// calcular área de retangulo

import java.util.Scanner;

public class Uni2Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    double largura = 0;
    double altura = 0;
    double area;
    System.out.println("Largura: ");
    largura = teclado.nextDouble();
    System.out.println("Altura: ");
    altura = teclado.nextDouble();

    area = largura * altura;
    System.out.println("Resulado: " + area);

    teclado.close();
  }
}