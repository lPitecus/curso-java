import java.util.Arrays;
import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        String palavra1 = "arara";
        //Transformando a palavra em um array de caracteres
        char[] array1 = palavra1.toCharArray();

        //Declarar um array com um tamanho igual à quantidade de letras na palavra que irá armazenar a palavra invertida.
        char[] palavra_invertida = new char[palavra1.length()];

        //Loop para percorrer a palavra do fim até o começo.
        for (int i = palavra1.length()-1; i >= 0; i--) {
            //Preencher o array invertido começando com o fim da palavra original.
            palavra_invertida[palavra1.length()-1-i] = palavra1.charAt(i);
        }
        //Checando se os arrays são iguais.
        if (Arrays.equals(array1, palavra_invertida)){
            System.out.println(palavra1+" é um palíndromo");
        }
        else {
            System.out.println(palavra1+" não é um palíndromo");
        }
    }
}
