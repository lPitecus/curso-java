public class Main {
    //2.1
    public static void main(String[] args) {
        //2.2
        System.out.print("Hello World\n");
        //2.3
        Livro livro = new Livro();
        livro.nome = "Calculo 1";
        livro.preco = 10;
        //2.4
        System.out.println(livro.nome);
        //2.5
        System.out.println("Preço do Livro: " + livro.preco);

        //3.1
        Autor novo_autor = new Autor();
        novo_autor.nome = "Sebastião";
        novo_autor.genero = "Masculino";
        novo_autor.idade = 45;

        Cliente novo_cliente = new Cliente();
        novo_cliente.nome = "Clarineto";
        novo_cliente.dinheiro = 800.0;
        novo_cliente.email = "claris@gmail.com";

        //3.2
        livro.setAutor(novo_autor);
        //3.3
        livro.ImprimirDados();
        //3.4
        novo_cliente.comprarLivro(livro);
    }
}