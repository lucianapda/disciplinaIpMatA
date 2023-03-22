/*

e atribua esta operação à variável PROD. A seguir mostre a variável PROD com
mensagem correspondente.   

__ Entrada
Ler(valorA) -> int
Ler(valorB) -> int

__ Processo

produto = valorA * valorB

__ Saída

imprima(PROD = )

_ Valores de Teste:
3
9
PROD = 27

*/

import java.util.Scanner;

public class Uni3Uri1004 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // _ Entrada
    int valorA = teclado.nextInt();
    int valorB = teclado.nextInt();

    // _ Processo
    int produto = valorA * valorB;

    // _ Saída
    System.out.println("PROD = " + produto);

    teclado.close();
  }
}
