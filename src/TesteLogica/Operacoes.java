package TesteLogica;

public class Operacoes {
    private int n1, n2, n3, n4, n5;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public int getN5() {
        return n5;
    }

    public void setN5(int n5) {
        this.n5 = n5;
    }
    
    
    public int[] somaSubsequentes(int n){
        int v[] = new int[5];
        
        for(int i= 1; i<=5; i++){
           v[i-1] = n * (n+i);  
        }
        
        return v;
    }
    
    public int[] concatenaTodos(int v1[],int v2[],int v3[],int v4[],int v5[]){
        int resultante[] = new int[25];
        
        for(int i=0; i<5; i++){
            resultante[i] = v1[i];
            resultante[i+5] = v2[i];
            resultante[i+10] = v3[i];
            resultante[i+15] = v4[i];
            resultante[i+20] = v5[i];
        }
        
        return resultante;
    }
    
    public int[] ordenaVetorTotal(int vetor[]){
        for(int i=0; i<vetor.length; i++){
            
            //Seleciona a posição do menor elemento inicial
            //Selection Sort
            int menor = i;
            for(int j=i+1; j<vetor.length; j++){
                if(vetor[j] < vetor[menor]) menor = j;
            }
            
            int swap = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = swap;
        }
        
        return vetor;
    }
}
