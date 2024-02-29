import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        //Exercício de Classes
//        Aluno aluno1 = new Aluno("Arthur", 23, 1.70);
//        Aluno aluno2 = new Aluno("Jeff", 18);
////        aluno1.setNome("Arthur");
////        aluno1.setIdade(23);
////        aluno1.setAltura(1.70);
//
//        System.out.println("-----Informações do aluno-----\n\n" +
//                "Nome: "+aluno1.getNome()+"\n" +
//                "Idade: "+aluno1.getIdade()+"\n" +
//                "Altura: "+aluno1.getAltura());
//
//        //Exercício de ArrayList
//        ArrayList<Integer> lista_de_num = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            lista_de_num.add(i);
//        }
//        System.out.println(lista_de_num);

        //Exercício dia 03
        Pessoa pessoa1 = new Pessoa("fabio", 'm', 33);
        Pessoa pessoa2 = new Pessoa("penelope", 's', 78);
        Pessoa pessoa3 = new Pessoa("diniz", 'm', 9);

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        GrupoDeAmigos grupo = new GrupoDeAmigos();
        grupo.setAmigoMaisVelho(listaPessoas);
        System.out.println(grupo.getAmigoMaisVelho().nome);

        }
    }
