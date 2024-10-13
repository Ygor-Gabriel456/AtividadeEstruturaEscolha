
package AtividadeEstruturaEscolha;

import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int num1,num2,opc;
        int media, mediaP;
        
        System.out.println("Escolha seu modo de operacao, para achar a media:");
        System.out.println("n1-Aritmetica/n2-Ponderada");
        opc = leia.nextInt();
        
        System.out.println("--------------------------");
        
        System.out.println("Digite sua primeira nota");
        num1 = leia.nextInt();
        
        System.out.println("Digite sua segunda nota");
        num2 = leia.nextInt();
        
        switch(opc){
            case 1:
                media = (num1 + num2) / 2;
                    System.out.println("Sua media é: " + media);
            break;
            case 2:
                mediaP = (num1*3) + (num2*7);
                int mediaTotal =  mediaP / (num1+num2);
                System.out.println("Sua media ponderada é: " + mediaTotal);
                 break;
            default:
                System.out.println("NuLL");
        }
    }
}
