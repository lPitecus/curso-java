public class Pessoa {
    public String nome;
    public char genero;
    public int idade;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, char genero, int idade){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public char getGenero() {
        return genero;
    }
}
