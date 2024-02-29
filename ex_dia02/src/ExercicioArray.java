public class ExercicioArray {
    public static void main(String[] args) {
        //Os [] no tipo da variável significa que será criada uma lista
        String[] listaCompras = new String[10];
        listaCompras[0] = "Kitut";
        listaCompras[1] = "Pão";
        listaCompras[2] = "Fanta Uva";
        listaCompras[3] = "Capa SamsungS10";
        listaCompras[4] = "Bola de Futsal";
        listaCompras[5] = "Teclado Mecânico";
        listaCompras[6] = "Shampoo";
        listaCompras[7] = "Chinelo Havaianas";
        listaCompras[8] = "Presunto";
        listaCompras[9] = "Linha de Costura";

        //Outra forma de criar um array: String[] listaCompras = {"Kitut", "Pão", "Fanta Uva"...}
        //Nessa outra forma o array é aberto com chaves {}.

        //Tipo de for loop chamado de forEach, onde a estrutura é
        //for (<Tipo da variável dos itens dentro do array> <variável temporária que o loop vai usar> : <nome do array>
        for (String item : listaCompras) {
            System.out.println(item);
        }
    }
}
