/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadeEstruturaEscolha;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
         
         int opc = 1;
         int d1;
         int dias;
         int horasExtras;
         int valorHorasExtras = 30;
         
         System.out.println("Me diga qual dia voce fez horas extras");
         System.out.println("n1-domingo\n2-segunda\n3-terca\n4-quarta\n5-quinta\n6-sexta\n7-sabado");
         dias = leia.nextInt();
         
         System.out.println("Por quantos dias voce fez horas extras");
         d1 = leia.nextInt();
         
         System.out.println("Quantas horas extra voce fez nesse dia");
         horasExtras = leia.nextInt();
         
         switch(opc){
            case 1:
            int  somaTotal1 = (valorHorasExtras * d1) + (50*50)/50;
                System.out.println("Domingo,Seu total a recber é R$" + somaTotal1);
                break;
            case 2:
            int  somaTotal2 = valorHorasExtras * d1;
               System.out.println("Segunda,Seu total a recber é R$" + somaTotal2);
               break;
            case 3:
            int  somaTotal3 = valorHorasExtras * d1;
               System.out.println("Terca,Seu total a recber é R$" + somaTotal3);
               break;
            case 4:
            int somaTotal4 = valorHorasExtras * d1;
                System.out.println("Quarta,seu total a receber é R$ " + somaTotal4);
                break;
            case 5:
                int somaTotal5 = valorHorasExtras * d1;
                System.out.println("Quinta,seu total a receber é R$ " + somaTotal5);
                break;
            case 6:
                int somaTotal6 = valorHorasExtras *  d1;
                System.out.println("Sexta, seu total a receber é R$ " +  somaTotal6);
                break;
            case 7:
                int somaTotal7 = (valorHorasExtras * d1) + (50*50)/50;
                System.out.println("Sabado, seu total a receber é R$ " + somaTotal7);
                break;
            default:
                System.out.println("NULO");
         }
            
    }
}
