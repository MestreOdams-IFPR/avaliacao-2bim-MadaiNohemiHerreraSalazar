import java.util.Scanner;

public class Ex1551_Corrigido {

    public static Scanner scanner = new Scanner(System.in);

    public static int lerInt() {
        int valor = scanner.nextInt();
        return valor;
    }

    public static String lerString() {
        String string = scanner.nextLine();
        return string;
    }

    public static String ehPalvraCompleta(String palavra) {

        palavra = palavra.toLowerCase();

        String estadoPalavra = "frase completa";

        int qntLetrasFaltantes = 0;

        char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        char[] palavraDividida = palavra.toCharArray();

        for (int i = 0; i < alfabeto.length; i++) {
            boolean achou = false;

            for (int j = 0; j < palavraDividida.length; j++) {

                if(alfabeto[i]==palavraDividida[j]){
                    achou = true;
                    break;
                }
                
            }

            if (achou == false) {
                qntLetrasFaltantes++;
            }
            
        }


        if (qntLetrasFaltantes == 0) {
            return estadoPalavra;
        } else if (qntLetrasFaltantes <= 13) {
            estadoPalavra = "frase quase completa";
            return estadoPalavra;
        } else {
            estadoPalavra = "frase mal elaborada";
            return estadoPalavra;

        }

    }

    public static void main(String[] args) {

        int testes = lerInt();
        scanner.nextLine();

        for (int i = 0; i < testes; i++) {

            String palavra = lerString();
            String estado = ehPalvraCompleta(palavra);
            System.out.println(estado);

        }

    }
}
