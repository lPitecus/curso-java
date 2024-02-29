public class Aluno {
    String nome;
    int idade;
    double altura;

    public Aluno(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public Aluno(int idade){
        this.idade = idade;
    }
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public void setIdade(int idade) {
//        this.idade = idade;
//    }
//
//    public void setAltura(double altura) {
//        this.altura = altura;
//    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}
