import java.util.Scanner;

public class CristaisKyber {

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

    // public static int[] quickSort(int[] v) {
    //     quickSort2(v, 0, v.length - 1);
    //     return v;
    // }

    // public static void quickSort2(int[] v, int inicio, int fim) {

    //     if (inicio < fim) {
    //         int meio = (inicio + fim) / 2;
    //         int pivo = v[meio];

    //         swap(v, meio, fim);
    //         int i = inicio - 1;
    //         int j = meio;

    //         do {
    //             i++;
    //         } while (i <= j && v[i] < pivo);
    //         do {
    //             j++;
    //         } while (i <= j && v[i] > pivo);

    //         if (i <= j) {
    //             swap(v, i, fim);
    //         }
    //         quickSort2(v, inicio, i - 1);
    //         quickSort2(v, i + 1, fim);
    //     }

    // }

    public static int[] selection(int[] v){

        int tam = v.length;
        for(int i = 0; i< tam; i++){
            int p = i;
            for(int j = i+1; j < tam; j++){
                if(v[j] < v[p]){
                    p = j;
                }
    
            }
    
            if(p != i){
                swap(v, i, p);
            }
        }
    
        return v;
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
                System.out.println(consultas[i] + " found at " + resultado);
            }

        }
    }

    public static void main(String[] args) {

        //Professor, queria pedir consideração para minha tentativa de utilizar o
        //metodo de ordenação mais eficaz. Não sei que aconteceu com meu quickSort :(

        int qntCristais;
        int qntConsultas;

        int testes= 1;

        do {
            qntCristais = lerInt();
            qntConsultas = lerInt();

            int[] cristais = preencherVetor(qntCristais);
            int[] consultas = preencherVetor(qntConsultas);

            cristais = selection(cristais);

            System.out.println();
            System.out.println("CASE#:"+ testes);
            programa(cristais, consultas);
            System.out.println();
            testes++;

           
        } while (qntCristais != 0 && qntConsultas != 0);

    }

}
