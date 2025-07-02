import java.util.Scanner;

public class TesteDaForca {

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
 
    public static int somaMelhores(int[] posicoes, int qntEscolhidos) {

        int soma = 0;
        int posicao = posicoes.length - 1;

        for (int i = 0; i < qntEscolhidos; i++) {

            soma += posicoes[posicao];
            posicao--;
        }

        return soma;
    }

    public static void main(String[] args) {
        int qntJovens = lerInt();
        int qntEscolhidos = lerInt();
        int[] posicoes = preencherVetor(qntJovens);

        posicoes = selection(posicoes);
        int soma = somaMelhores(posicoes, qntEscolhidos);
        System.out.println(soma);

    }

}
