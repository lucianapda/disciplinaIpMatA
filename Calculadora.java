
import java.util.Scanner;

public class Calculadora {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    double primeiroNumero,segundoNumero;
    int Operação;
    double soma,subtração,multiplicação,divisão;

    System.out.println("Digite um número:");
    primeiroNumero=input.nextDouble();

    System.out.println("Digite outro número:");
    segundoNumero=input.nextDouble();

    System.out.println("Para selecionar sua a operação:");
    System.out.println("[1] para soma.:");
    System.out.println("[2] para subtração.");
    System.out.println("[3] para multiplicação.");
    System.out.println("[4] para divisão.");
    System.out.println("Digite o número de sua operação.");
        Operação=input.nextInt();
        
        switch(Operação){
       
            case 1:
            soma=primeiroNumero+segundoNumero;
            System.out.println("O resultado da soma é " + soma + ".");
                break;
    
            case 2:
            subtração=primeiroNumero-segundoNumero;
            System.out.println("O resultado da subtração é " + subtração + ".");
                break;
            case 3:
            multiplicação=primeiroNumero*segundoNumero;  
               if(multiplicação == 0){
                System.out.println("Foi impossivel de concluir sua operação.");
               }
               else{
                System.out.println("O resultado da multiplicação é " + multiplicação + ".");
               }
                break;
            case 4:
            divisão=primeiroNumero/segundoNumero;
                if(primeiroNumero == 0){
                    System.out.println("Foi impossivel de concluir sua operação.");
                   }
                   else if(segundoNumero == 0){
                    System.out.println("Foi impossivel de concluir sua operação.");
                   }
                   else{
                    System.out.println("O resultado divisão é " + divisão + ".");
                   }
                break;
               default:
               System.out.print("Erro, tente novamente.");
               }
           input.close();
        } 
    }