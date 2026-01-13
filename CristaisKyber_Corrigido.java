import java.util.Scanner;

public class CristaisKyber_Corrigido {

    public static Scanner scanner = new Scanner(System.in);

    public static int lerInt() {
        int valor = scanner.nextInt();
        return valor;
    }

    public static int[] preencherVetor(int n) {

        int[] posicoes = new int[n];

        for (int i = 0; i < n; i++) {

            posicoes[i] = lerInt();

        }

        return posicoes;

    }

    public static void imprimirVetor(int[] v){

        for (int i = 0; i < v.length; i++) {

            System.out.print( v[i]+ " ");
            
        }
    }

    public static void swap(int[] v, int i, int p) {

        int temp = v[i];
        v[i] = v[p];
        v[p] = temp;

    }


       public static int[] mergeSortRecursivo(int[] vet, int inicio, int fim) {
        if (inicio < fim - 1) {
            int meio = (inicio + fim) / 2;
            mergeSortRecursivo(vet, inicio, meio);
            mergeSortRecursivo(vet, meio, fim);
            mergeSort(vet, inicio, meio, fim);
        }
        return vet;
    }
    
    public static void mergeSort(int[] vet, int inicio, int meio, int fim) {
        int i = inicio;
        int j = meio;
        int k = 0;
        int[] vetAuxiliar = new int[fim - inicio];
    
        while (i < meio && j < fim) {
            if (vet[i] <= vet[j]) {
                vetAuxiliar[k++] = vet[i++];
            } else {
                vetAuxiliar[k++] = vet[j++];
            }
        }
    
        while (i < meio) {
            vetAuxiliar[k++] = vet[i++];
        }
    
        while (j < fim) {
            vetAuxiliar[k++] = vet[j++];
        }
    
        for (i = inicio, k = 0; i < fim; i++, k++) {
            vet[i] = vetAuxiliar[k];
        }
    }

    public static int pesquisaBiNum(int[] v, int x) {

        return pesquisaNum(v, 0, v.length - 1, x);

    }

    public static int pesquisaNum(int[] v, int inf, int sup, int x) {

        int meio;
        if (inf <= sup) {
            meio = (inf + sup) / 2;
            if (x == v[meio]) {
                return meio;
            } else if (x < v[meio]) {
                return pesquisaNum(v, inf, meio - 1, x);
            } else {
                return pesquisaNum(v, meio + 1, sup, x);
            }
        } else {
            return -1;
        }

    }

    public static void programa(int[] cristais, int[] consultas) {

        for (int i = 0; i < consultas.length; i++) {

            int resultado = pesquisaBiNum(cristais, consultas[i]);

            if (resultado == -1) {

                System.out.println(consultas[i] + " not found");
            } else {
                System.out.println(consultas[i] + " found at " + (resultado+1));
            }

        }
    }

    public static void main(String[] args) {

        int qntCristais;
        int qntConsultas;

        int testes= 1;

        do {
            qntCristais = lerInt();
            qntConsultas = lerInt();

            int[] cristais = preencherVetor(qntCristais);
            int[] consultas = preencherVetor(qntConsultas);

            cristais = mergeSortRecursivo(cristais, 0, cristais.length);

            System.out.println();
            System.out.println("CASE#:"+ testes);
            programa(cristais, consultas);
            System.out.println();
            testes++;

           
        } while (qntCristais != 0 && qntConsultas != 0);

    }

}

