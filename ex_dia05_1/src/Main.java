import java.util.ArrayList;

public class Main {



    public static <T extends Number> double calcularMedia(ArrayList<T> lista){
        double media = 0;
        double soma = 0;
        for (T idade: lista){
            soma = soma + idade.doubleValue();
        }
        media = soma/lista.size();
        return media;
    }
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<>();
        idades.add(5);
        idades.add(10);
        idades.add(25);
        idades.add(50);
        System.out.println(calcularMedia(idades));

    }

}