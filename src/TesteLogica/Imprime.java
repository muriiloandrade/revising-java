package TesteLogica;

public class Imprime {
    public void imprime(int v[]){
        System.out.print("Seus subsequentes são: ");
        for(int i=0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.print("\n\n");
    }
}
