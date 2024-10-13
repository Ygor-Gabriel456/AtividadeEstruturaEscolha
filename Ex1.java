/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeEstruturaEscolha;

import java.util.Scanner;

/**
 *
 * @author ygorg
 */
public class Ex1 {
    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
        
        int opc;
       
        
        System.out.println("Dgite sua opcao");
        System.out.println("n-soma\n2subtração\n3 multiplicacao\n4-divisao\n5-sair");
        opc = leia.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Voce escolheu soma");
                break;
            case 2:
                System.out.println("Voce escolheu subtração ");
                break;
            case 3:
                System.out.println("Voce escolheu multiplicacap");
                break;
            case 4:
                System.out.println("Voce esoclheu divisao");
                break;
            case 5:
                System.out.println("sair");
            default:
                System.out.println("Nao foi possivel encontrar essa opcao");
        }
    }
}
