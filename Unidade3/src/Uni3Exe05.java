/*
//__ Entradas: 
1x valorChip = 4.00
2x valorAnel = 3.50 = 7.00
ler(qtdFrangos)

//__ Processos: 
valorPorFrango = valorChip + (valorAnel * 2)
totalGastoGranja = qtdFrangos * valorPorFrango

//__ Saídas: 
imprimir(totalGastoGranja)

*/
/*
__ Valores de Testes: 
_ Caso 1 ___
1x valorChip = 4.00
2x valorAnel = 3.50 = 7.00
ler(qtdFrangos) = 10
valorPorFrango = valorChip + (valorAnel * 2) = 11.00
totalGastoGranja = qtdFrangos * valorPorFrango = 110.00
*/
import java.util.Scanner;

public class Uni3Exe05 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //__ Entradas: 
    double valorChip = 4.00;
    double valorAnel = 7.00; // 3.50 * 2
    System.out.print("qtdFrangos: ");
    int qtdFrangos = teclado.nextInt();

    //__ Processos: 
    // double valorPorFrango = valorChip + valorAnel;
    // double totalGastoGranja = qtdFrangos * valorPorFrango;

    double totalGastoGranja = qtdFrangos * (valorChip + valorAnel);

    //__ Saídas: 
    System.out.println("Total: " + totalGastoGranja);

    teclado.close();
  }
}
