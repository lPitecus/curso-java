public class Autor {
    String nome;
    String genero;
    int idade;
    public String obterNome(){
        return nome;
    }
    public String obterGenero(){
        return genero;
    }
    public int obterIdade(){
        return idade;
    }
    public void imprimirDados(){
        System.out.println("Nome do Autor: " + this.nome + "\nGênero do Autor: " + this.genero + "\nIdade do Autor: " + this.idade);
    }
    public void mudarNome(String nome){ //O uso do void é feito quando um método não retorna nada.
        this.nome = nome;
    }
    public void mudarIdade(int idade){
        this.idade = idade;
    }
    public void mudarGenero(String genero){
        this.genero = genero;
    }
}
