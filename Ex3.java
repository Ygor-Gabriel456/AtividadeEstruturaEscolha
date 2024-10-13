package AtividadeEstruturaEscolha;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double valorParcelado, valorCompra, valorFinal;
        int qtdeParcelas;
        int juros=1;
        
        System.out.println("Entre com o valor da compra");
        valorCompra = leia.nextDouble();
        
        System.out.println("Entre com a quantidade de parcelas");
        qtdeParcelas = leia.nextInt();
        
        switch(qtdeParcelas){
            case 2:
                System.out.println(juros == 3);
                break;
            case 4:
                System.out.println(juros == 7);
                break;
            case 6:
                System.out.println(juros == 9);
                break;
            case 8:
                System.out.println(juros == 12);
                break;
            default:
                System.out.println(juros = -1);
        }
        
        if(juros == -1){
            System.out.println("Numeros de parcela incorreta");
        }
        else{
            valorFinal = valorCompra + valorCompra * juros  / 100;
            valorParcelado = valorFinal/qtdeParcelas;
            System.out.println("O valor de cada parcela é " + valorParcelado);
        }
    }
}
