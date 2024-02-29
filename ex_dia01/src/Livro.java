public class Livro {
    String nome;
    int num_paginas;
    double preco;
    Autor novoAutor;
    public String getNome(){
        return nome;
    }
    public int getNumPaginas(){
        return num_paginas;
    }
    public double getPreco(){
        return preco;
    }
    public Autor getAutor(){
        return novoAutor;
    }
    public void ImprimirDados(){
        System.out.println("Nome do livro: " + this.nome + "\nNúmero de Páginas: " + this.num_paginas + "\nPreço: R$" + this.preco);
        this.novoAutor.imprimirDados();
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumPaginas(int num_paginas){
        this.num_paginas = num_paginas;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setAutor(Autor autor){
        this.novoAutor = autor;
    }
}
