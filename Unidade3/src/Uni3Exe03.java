/*
Enunciado ___ Um motorista deseja abastecer seu tanque de combustível. Escreva

Gordura ___
um programa para 

Entrada __
ler o preço do litro da gasolina
valor do pagamento

Processo ___
QuantidadeLitros = valorPagamento / precoLitro

Saída __
quantos litros ele conseguiu colocar no tanque.

Testes ___ A
valorLitro = 2
valorPagto = 20,00
qtdLitros = 10

Testes ___ B
valorLitro = 2,4
valorPagto = 20,00
qtdLitros = 8,3333333333

Testes ___ B
valorLitro = -2,4
valorPagto = 20,00
qtdLitros = 

Testes ___ C
valorLitro = 0
valorPagto = 20,00
qtdLitros = 

*/

import java.util.Scanner;

public class Uni3Exe03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double valorLitro;
    double valorPagto;
    double qtdLitros;

    // Entrada ___
    System.out.print("Valor litro: ");
    valorLitro = teclado.nextDouble();
    System.out.print("Valor pago: ");
    valorPagto = teclado.nextDouble();

    // Processo ___
    qtdLitros = valorPagto / valorLitro;

    // Saída ___
    System.out.println("Quantidade de litros abastecida: " + qtdLitros);

    teclado.close();
  }
}
