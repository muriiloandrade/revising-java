package TesteLogica;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operacoes c = new Operacoes();
        Imprime i = new Imprime();
        
        System.out.print("Insira o 1º número: ");
        c.setN1(input.nextInt());
        int[] v1 = c.somaSubsequentes(c.getN1());
        i.imprime(v1);
        System.out.print("Insira o 2º número: ");
        c.setN2(input.nextInt());
        int[] v2 = c.somaSubsequentes(c.getN2());
        i.imprime(v2);
        System.out.print("Insira o 3º número: ");
        c.setN3(input.nextInt());
        int[] v3 = c.somaSubsequentes(c.getN3());
        i.imprime(v3);
        System.out.print("Insira o 4º número: ");
        c.setN4(input.nextInt());
        int[] v4 = c.somaSubsequentes(c.getN4());
        i.imprime(v4);
        System.out.print("Insira o 5º número: ");
        c.setN5(input.nextInt());
        int[] v5 = c.somaSubsequentes(c.getN5());
        i.imprime(v5);

        int[] vResultante = c.concatenaTodos(v1, v2, v3, v4, v5);
        
        System.out.println("Todos os valores operados desordenados:");
        i.imprime(vResultante);
        
        System.out.println("Todos os valores operados ordenados:");
        i.imprime(c.ordenaVetorTotal(vResultante));
    }
}
