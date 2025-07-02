import java.util.Scanner;

public class ProvaRecursividade{

    public static Scanner scanner =  new Scanner(System.in);

    public static int lerInt(){
        int valor = scanner.nextInt();
        return valor;
    }

    public static String leString(){
        String string = scanner.nextLine();
        return string;
    }

    public static int tribonacci(int n){

        if(n == 0){
            return 0;
        }else if(n == 1){
            return 0;
            
        }else{
            if(n == 2){
                return 1;
            }
            
        }

            return n + tribonacci(n-1);

    }

    public static int pell(int m){

        if(m == 0){
            return 0;
        }else if(m == 1){
            return 1;
        }
        
        return 2*m + pell(m - 1);
    }

   

    public static void main(String[] args) {

        // QUETÃO 1-

        //Esse codigo está utilizando um metodo recursivo para  para verter a ordem de um vetor!!
        //Por exemplo, se o vetor original era: v = {1, 2, 3}, agora sería: v = {3, 2, 1}
        //Já que ele faz um swap e logo na chamada recursiva: metodoRec02(v, e+ 1, d -1);
        //ele pega os dois proximos numeros que seram trocados, tudo isso até que todos os números sejam trocados.


        //QUESTÃO 2-


        // int n = 5;
        //System.out.println(tribonacci(n));



        //QUESTÃO 3-

        // int m = 5;
        // System.out.println(pell(m));

            
        

        

         
    }

}