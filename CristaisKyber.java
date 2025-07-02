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

    public static void swap(int[] v, int i, int p){

        int temp = v[i];
        v[i] = v[p];
        v[p] = temp;


    }

    public  static void quickSort(int[] v){
        quickSort2(v, 0, v.length-1);
    }

    public static void quickSort2(int[] v, int inicio, int fim){

        if(inicio < fim){
            int meio = (inicio + fim)/2;
            int pivo = v[meio];

            swap(v, meio, fim);
            int  i = inicio -1;
            int j = meio;


                do{
                    i++;
                }while(i <= j && v[i]< pivo);
                do{
                j++;
                }while (i <= j && v[i] > pivo);

                if(i <= j){
                    swap(v, i, fim);
                }
                quickSort2(v, inicio, i-1);
                quickSort2(v, i+1, fim);
        }

    }

    public static void main(String[] args) {

        while()

        int qntCristais = lerInt();
        int qntConsultas = lerInt();

        int[] cristais = preencherVetor(qntCristais);
        int[] consultas  = preencherVetor(qntConsultas);
        
    }


    
}
