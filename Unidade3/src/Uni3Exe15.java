/*
//__ Entradas: 
ler(numero) // 0> e <1000

//__ Processos: 

//__ Saídas: 
X centena(s)  Y dezena(s) K unidade(s)  
Exemplo, se for submetido o número 384, o programa deverá exibir:
3 centena(s)  8 dezena(s) 4 unidade(s)  


*/

import java.util.Scanner;

public class Uni3Exe15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //__ Entradas: 
    System.out.println("Informe o número: ");
    int numero = teclado.nextInt();// 0> e <1000
    int centena = 0, dezena = 0, unidade = 0;

    // //__ Processos A: 
    // centena = numero / 100;
    // numero = numero % 100;
    // dezena  = numero / 10;
    // numero = numero % 10;
    // unidade = numero;

    //__ Processos B: 
    centena = numero / 100;
    numero = numero - (centena * 100);
    dezena  = numero / 10;
    numero = numero - (dezena * 10);
    unidade = numero;

    //__ Saídas: 
    System.out.println(centena + " centena(s)  " + dezena + " dezena(s) " + unidade + " unidade(s)");
    
    teclado.close();
  }
}


