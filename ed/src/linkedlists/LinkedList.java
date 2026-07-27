package linkedlists;

import java.util.Locale;
import java.util.Scanner;

public class LinkedList {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new List<>();

        int opc = 0;

        while(opc != 4){
            System.out.println("Lista encadeada system: \n1 - Inserir dado \n2 - Ver lista \n3 - Inserir em um índice específico \n4 - Sair");
            System.out.print("> Digite um numero: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Digite um número: ");

                    Integer value1 = sc.nextInt();
                    list.add(value1);
                    break;
                case 2:
                    System.out.println(list);
                    break;
                case 3:
                    System.out.println("Digite um valor: ");
                    Integer value2 = sc.nextInt();

                    System.out.println("Digite um indice: ");
                    Integer index = sc.nextInt();

                    list.addInIndex(value2, index);
                    break;
                case 4:
                    System.out.println(">>> Fim do programa <<<");
                    opc = 4;
            }
        }

        sc.close();

    }



}
