import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Integer> vetor1 = new Vector<>();        //Criação dos vetores
        Vector<Integer> vetor2 = new Vector<>();


        //Atribuindo valores aos vetores, cada linha adiciona um valor no vetor em ordem
        vetor1.add(1);      //Primeiro valor do vetor1;
        vetor1.add(3);      //Segundo valor do vetor1...
        vetor1.add(5);
        vetor2.add(2);
        vetor2.add(4);
        vetor2.add(6);

        //Declarando variáveis utilizadas
        int soma = 0;
        int multi = 0;

        //Iterando cada índice do vetor
        for (int i = 0; i < vetor1.size(); i++) {
            multi = vetor1.get(i)*vetor2.get(i);        //Multiplicando os elementos de mesmo indice
            soma += multi;                              //Somando o resultado da multiplicação de cada índice
        }
        System.out.println("Valor: " + soma);
    }
}